job ('NGINX Groovy Example') {
    scm {
        git ('https://github.com/iamsherry97/jenkins-static-app')
    }
    triggers {
        scm ('H/5 * * * *')
    }
    wrappers {
       
    }
    steps {
        shell "apt install ngnix"
    }
}