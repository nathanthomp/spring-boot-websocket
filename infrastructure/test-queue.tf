resource "aws_sqs_queue" "test_queue" {
  name                      = "test-queue"
  message_retention_seconds = 86400
}