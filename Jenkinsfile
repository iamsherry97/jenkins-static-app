node {
    stage('Connection with server') {
        sshagent (credentials: ['sherryinstance']) {
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@34.221.226.18 uptime'
            sh 'ssh -v ubuntu@34.221.226.18'
            sh 'touch /var/www/html/file.txt'
            sh 'rm /var/www/html/*'
            sh 'git clone https://github.com/iamsherry97/jenkins-static-app "app-$BUILD_ID"'
            sh 'cp "app-$BUILD_ID"/* /var/www/html/'
        }
    }
}