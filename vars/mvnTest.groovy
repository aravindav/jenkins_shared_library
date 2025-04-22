def call(String mavenGoals = 'clean test') {
    sh "mvn ${mavenGoals}"
}