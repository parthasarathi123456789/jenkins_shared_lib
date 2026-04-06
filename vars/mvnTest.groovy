def call() {
    sh '''
    docker run --rm \
      -v $PWD:/app \
      -w /app \
      maven:3.9.6-eclipse-temurin-11 \
      mvn clean test
    '''
}
