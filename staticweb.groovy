job ('NGINX Groovy Example') {
    scm {
        git ('https://github.com/iamsherry97/jenkins-static-app')
    }
    triggers {
        scm ('H/5 * * * *')
    }
    wrappers {
        shell ('apt get update')
    }
    steps {
        shell "apt install ngnix"
    }
}