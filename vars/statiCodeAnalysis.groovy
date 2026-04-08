def call(String credId) {
    withSonarQubeEnv(credId) {
        sh '''
        export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
        export PATH=$JAVA_HOME/bin:$PATH

        mvn clean verify sonar:sonar \
        -Dsonar.projectKey=java-app
        '''
    }
}
