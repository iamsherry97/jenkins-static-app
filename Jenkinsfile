// node {
//    stage('Connection with server') {
//        sshagent (credentials: ['sherryinstance']) {
//            sh 'ssh -o StrictHostKeyChecking=no ubuntu@18.236.96.234 uptime'
//            sh 'ssh -v ubuntu@34.221.226.18 bash /home/ubuntu/script.sh'
      //      sh 'scp /var/lib/jenkins/workspace/assignment-pipeline/* ubuntur@34.221.226.18:/var/www/html/*'
//        }
//    }
//}
pipeline {
    agent all
    node {
        stage ('Connection and changes'){
            steps {
                sshagent (credentials: ['sherryinstance']) {
                    sh 'ssh -o StrictHostKeyChecking=no ubuntu@18.236.96.234uptime'
                    sh 'ssh -v ubuntu@18.236.96.234 touch /var/www/html/file.txt'
                    sh 'ssh -v ubuntu@18.236.96.234 rm /var/www/html/*'
                    sh 'ssh -v ubuntu@18.236.96.234 git clone https://github.com/iamsherry97/jenkins-static-app "app-$BUILD_ID"'
                    sh 'ssh -v ubuntu@18.236.96.234 cp "app-$BUILD_ID"/* /var/www/html/'

            }
        }
    }
}
}