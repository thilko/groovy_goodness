import org.codehaus.groovy.util.ReleaseInfo

println ReleaseInfo.version
println ReleaseInfo['ImplementationVersion']
println ReleaseInfo.get('BuildTime')
println ReleaseInfo.get('BundleVersion')
println ReleaseInfo['BuildDate']
