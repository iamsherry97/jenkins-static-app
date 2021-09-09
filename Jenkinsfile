node {
    stage('Connection with server') {
        sshagent (credentials: ['sherryinstance']) {
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@34.221.226.18 uptime'
    //        sh 'ssh -v ubuntu@34.221.226.18'
            sh 'scp /var/lib/jenkins/workspace/assignment-pipeline/* ubuntur@34.221.226.18:/var/www/html/*'
        }
    }
}