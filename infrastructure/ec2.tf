# resource "aws_instance" "my_ec2" {
#     ami           = "amazon machine image"
#     instance_type = "t2.micro"

#     security_groups = [aws_security_group.websocket_sg.name]

#   provisioner "file" {
#     source      = "your-app.jar"
#     destination = "/home/ec2-user/your-app.jar"
#   }

#   provisioner "remote-exec" {
#     inline = [
#       "java -jar /home/ec2-user/your-app.jar"
#     ]
#   }


# }

# resource "aws_security_group" "websocket_sg" {
#   name        = "websocket_sg"
#   description = "Allow WebSocket traffic"

#   ingress {
#     from_port   = 8080
#     to_port     = 8080
#     protocol    = "tcp"
#     cidr_blocks = ["0.0.0.0/0"]
#   }

#   egress {
#     from_port   = 0
#     to_port     = 0
#     protocol    = "-1"
#     cidr_blocks = ["0.0.0.0/0"]
#   }
# }