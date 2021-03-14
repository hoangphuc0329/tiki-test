(1)
- Test: mvn test
- Test and build file jar: mvn clean install
- Run file jar: java -jar [path to file jar]

(2) Image: hoangphuc0329/tiki-test:main.1

(3) GIthub Deployment Repo: https://github.com/hoangphuc0329/tiki-deployment.git
    If you want to expose the services via http://abc.xyz, use loadbalancer type with a DNS record "abc.xyz"
    
(4) Use JenkinsFile
    To delivery separated in various environment, we will create multiple branches for each environment in this repository and use argoCD to manage those k8s manifest on each branchs
    
(5) Firstly, we need to deploy a set of monitoring services for this k8s cluster. we can use Prometheus and Grafana.
    Prometheus will have us collect all the metrics expose by K8s cluster and the application itself and store it in the database or local file.
    Grafana will visualize Prometheus metrics by query them via prometheus API and visualize it in a web UI.
