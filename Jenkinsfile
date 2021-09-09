pipeline {
    agent any
    stages {
        stage ('Connection with server') {
            steps {
                sshagent (credentials: ['sherryinstance']) {
                    sh 'ssh -o StrictHostKeyChecking=no ubuntu@34.221.226.18 uptime'
                    sh 'ssh -v ubuntu@34.221.226.18'
                    sh ('sudo  touch /var/www/html/file.txt')
                    sh ('sudo rm /var/www/html/*')
                    sh ('git clone https://github.com/iamsherry97/jenkins-static-app "app-$BUILD_ID"')
                    sh ('sudo cp "app-$BUILD_ID"/* /var/www/html/')              
                }
            }
        }
        stage ('Configuration changes') {
            steps {
                sh ('sudo  touch /var/www/html/file.txt')
                sh ('sudo rm /var/www/html/*')
                sh ('git clone https://github.com/iamsherry97/jenkins-static-app "app-$BUILD_ID"')
                sh ('sudo cp "app-$BUILD_ID"/* /var/www/html/')
            }     
        }
    }
}
