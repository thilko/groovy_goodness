import groovy.transform.*

class Reservation {
    private Date date
    private String event
    private String attendee
    void date(final Date date) { this.date = date }
    void event(final String event) { this.event = event }
    void attendee(final String attendee) { this.attendee = attendee }
    /** Submit a reservation.
      * @param config Configuration for reservation,
      *               invoking method class on Reservation.
      */
    static void submit(@DelegatesTo(Reservation) final Closure config) {
        final Reservation reservation = new Reservation()
        reservation.with config
} }


@TypeChecked
// @CompileStatic - will also do static type checking
class Event {
/** Use Reservation configuration DSL to submit a reservation. */
void submitReservation() {
    Reservation.submit {
        date Date.parse('yyyyMMdd', '20130522')
        event 'Gr8Conf'
        attendee 'mrhaki'
        reserved true
} }
}
final event = new Event()
event.submitReservation()
