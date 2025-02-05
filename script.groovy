def buildApp() {
    echo "building the application..."
    sh 'mvn package'
} 

def testApp() {
    echo "test the applications..."
    
    
} 

def deployApp() {
    echo 'deploying ...'
    echo "deplaying version ${params.VERSION}"
} 

return this