import { CanActivateFn } from '@angular/router';

export const sellerAuthGuard: CanActivateFn = (route, state) => {
  return false;
};
