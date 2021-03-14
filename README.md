# (1) Application:
    - Test: mvn test
    - Test and build file jar: mvn clean install
    - Run file jar: java -jar [path to file jar]

# (2) Image: 
    hoangphuc0329/tiki-test:main.1
![tiki](https://user-images.githubusercontent.com/13900550/111077962-cfb59480-8525-11eb-96c5-71c2debda6fd.PNG)

# (3) GIthub Deployment Repo: https://github.com/hoangphuc0329/tiki-deployment.git
    If you want to expose the services via http://abc.xyz, use loadbalancer type with a DNS record "abc.xyz"
    
# (4) Use JenkinsFile in this repository to create CI/CD Pipeline
    To delivery separated in various environment, we will create multiple branches for each environment in this repository and use argoCD to manage those k8s manifest on each branchs
    - As for development, we will continuously trigger by merger event from developer to a branch in this repository and deploy it on development envinronment.
    - As for staging or UAT we will continuously trigger the build by tagging a version from a set of cherry-pick commit and deploy this tag version onst staging envinronment.
    - As for production, we will deploy a specific tag version which been deployed from staging or UAT to deploy to Production envinronment.
    
## CI/CD Architecture
![Tiki](https://user-images.githubusercontent.com/13900550/111078419-e0670a00-8527-11eb-87de-b2016eb3268b.png)


    
# (5) Firstly, we need to deploy a set of monitoring services for this k8s cluster. we can use Prometheus and Grafana.
    Prometheus will have us collect all the metrics expose by K8s cluster and the application itself and store it in the database or local file.
    Grafana will visualize Prometheus metrics by query them via prometheus API and visualize it in a web UI.
