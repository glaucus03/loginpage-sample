@Component
class CustomAuthenticationFailureHandler : AuthenticationFailureHandler {
  override fun onAuthenticationFailure(request: HttpServletRequest,
                                       response: HttpServletResponse,
                                       exception: AuthenticationException) {
    if (response.isCommitted) {
      return
    }
    response.sendError(HttpStatus.UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.reasonPhrase)
  }
}
