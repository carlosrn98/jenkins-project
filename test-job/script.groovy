pipeline {
    agent {
        label "slave1"
    }
    stages {
        stage("Test that it is working") {
            steps {
                sh "echo 'The pipeline works!'"
            }
        }
    }
}