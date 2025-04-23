def call() {
    sh 'mvn verify -DiskUnitTests'
}