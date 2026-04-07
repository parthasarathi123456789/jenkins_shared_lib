def call() {
    def mvnHome = tool 'maven3'
    withEnv(["PATH+MAVEN=${mvnHome}/bin"]) {
        sh 'mvn clean test'
    }
}
