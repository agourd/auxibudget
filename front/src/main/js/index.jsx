import 'babel-polyfill';
import React from 'react';
import ReactDOM from 'react-dom';
import { AppContainer } from 'react-hot-loader';

import Root from './Root';

const render = (Component) => {
    ReactDOM.render(
        <AppContainer>
            <Component />
        </AppContainer>,
        /* eslint-disable no-undef */
        document.getElementById('root'),
    );
};

render(Root);

// Hot Module Replacement API
if (module.hot) {
    module.hot.accept('./Root', () => {
        const RootContainer = Root;
        render(RootContainer);
    });
}