@Component
class CustomAuthenticationSuccessHandler : AuthenticationSuccessHandler {
  override fun onAuthenticationSuccess(request: HttpServletRequest,
                                       response: HttpServletResponse,
                                       auth: Authentication) {
    if (response.isCommitted) {
      return
    }
    response.status = HttpStatus.OK.value()
  }
}
