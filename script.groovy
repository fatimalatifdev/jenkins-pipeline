def Build(){
    echo 'Building the application...'
        bat "docker build -t ${env.APP_NAME}:${env.TAG} ."  // build image with tag
        bat "docker tag ${env.APP_NAME}:${env.TAG} ${env.REPO_NAME}:${env.TAG}"  // tag image with your repo name

}

def Test(){
    echo 'Testing the application...'// you can add your test cases here
}

def Deploy(){
    echo "Deploying the application..."
    bat "docker-compose up -d"
}

return this