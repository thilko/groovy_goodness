def bernd = """Wenn Sie mich suchen, ich halte mich in der Nähe des Wahnsinns auf, genauer gesagt
auf der schmalen Linie zwischen Wahnsinn und Panik, gleich um die Ecke von Todesangst, nicht weit
weg von Irrwitz und Idiotie!"""

assert bernd[1] == "e"
assert bernd[5..7] == "Sie"
assert bernd[9..12].collect{it.toUpperCase()}.join() == "MICH"

assert "bernd".capitalize() == "Bernd"
