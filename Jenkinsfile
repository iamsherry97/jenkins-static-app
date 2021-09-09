node {
    stage('Connection with server') {
        sshagent (credentials: ['sherryinstance']) {
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@34.221.226.18 uptime'
            sh 'ssh -v ubuntu@34.221.226.18 sudo rm /var/www/html/*
git clone https://github.com/iamsherry97/jenkins-static-app "app-$BUILD_ID"
sudo cp "app-$BUILD_ID"/* /var/www/html/'
      //      sh 'scp /var/lib/jenkins/workspace/assignment-pipeline/* ubuntur@34.221.226.18:/var/www/html/*'
        }
    }
}