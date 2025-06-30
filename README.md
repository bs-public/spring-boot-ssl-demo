# Spring Boot SSL Demo

## Enabling SSL using two approaches
 - Traditional approach
 - Bundle approach

## Certificate Generation Instructions

### Generate PEM-formatted private key and self-signed certificate using OpenSSL

```bash
openssl req -x509 -newkey rsa:2048 -keyout demo.key -out demo.crt -days 3650 -nodes -subj "/CN=localhost"
```

* `-nodes` means the private key is **not encrypted** with a passphrase (optional).
* `-subj` sets the certificate subject inline (avoids prompts).

### Convert PEM files into a PKCS#12 keystore

```bash
openssl pkcs12 -export -in demo.crt -inkey demo.key -out demo.p12 -name demo -passout pass:password
```

## Verification
```bash
$ curl -k https://localhost:8443/
Hello World
```
