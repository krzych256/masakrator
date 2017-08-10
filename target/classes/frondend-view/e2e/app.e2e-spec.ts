import { FrondendViewPage } from './app.po';

describe('frondend-view App', () => {
  let page: FrondendViewPage;

  beforeEach(() => {
    page = new FrondendViewPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
