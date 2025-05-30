# Use a lightweight Node.js image
FROM node:18-alpine

# Set the working directory in the container
WORKDIR /app

# Copy your static website files to the container
COPY . .

# Install a static file server (http-server)
RUN npm install -g http-server

# Expose the port the server will run on
EXPOSE 3000

# Command to run the static file server
CMD ["http-server", ".", "-p", "3000"]
