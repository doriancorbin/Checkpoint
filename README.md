# CourseProject-Option1
Steps to get docker images on Kubernetes:
1. Sourced and created images for all applications
2. Uploaded the 6 images: (Terminal app, Apache Spark, Hadoop, Jupyter, Sonar Qube/Scanner) to my docker hub
3. Pulled and Tagged those images on GCP and added them to the Container Registry
4. Created a Kubernetes Cluster
5. Clicked "Deploy" on the Kubernetes Engine
6. Selected the Cluster I just created
7. Added the six containers I added to registry into the deployment
