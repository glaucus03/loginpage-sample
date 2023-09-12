import { rest } from 'msw'

export const handlers = [
  rest.post('/login', (_req, res, ctx) => {
    return res(
      ctx.status(200),
      ctx.cookie('sesionId','12345', {maxAge: 30}),
      ctx.json({
        message: 'Login successed!',
      })
    )
  }),
]
