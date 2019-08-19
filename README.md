# easy-spring-boot-oauth2-server

This is a spring-boot2 OAuth2 server, powered by spring-boot-security and easy-spring-boot-starter.

It supports simple configuration for memory or jdbc implementation.

## For development:
- Change coressponding configs in application.yml.

```yaml
easy.security.oauth2server.source:
  client: memory
  user: memory
```

## For production:
```yaml
easy.security.oauth2server.source:
  client: jdbc
  user: jdbc
```
