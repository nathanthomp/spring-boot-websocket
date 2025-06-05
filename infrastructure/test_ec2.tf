# resource "aws_instance" "my_ec2" {

#     ami             = "ami-0ae9f87d24d606be4"
#     instance_type   = "t2.micro"

#     # provisioner "file" {
#     #     source      = "spring-boot-websocket-0.0.1.jar"
#     #     destination = "/home/ec2-user/spring-boot-websocket-0.0.1.jar"

#     #     connection {
#     #         type        = "ssh"
#     #         user        = "ec2-user"
#     #         private_key = file("~/.ssh/id_rsa")
#     #         host        = self.public_ip
#     #     }
#     # }



#     # provisioner "remote-exec" {
#     #     inline = [
#     #         "dnf install java-21-amazon-corretto",
#     #         "dnf install maven",
#     #         "java -jar /home/ec2-user/spring-boot-websocket-0.0.1.jar"
#     #     ]
#     # }

# }