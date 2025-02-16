import firebase from 'firebase/app';

/* eslint-disable no-undef */
const firebaseConfig = {
  apiKey: process.env.REACT_APP_FCM_API_KEY,
  authDomain: process.env.REACT_APP_FCM_AUTH_DOMAIN,
  projectId: process.env.REACT_APP_FCM_PROJECT_ID,
  storageBucket: process.env.REACT_APP_FCM_STORAGE_BUCKET,
  messagingSenderId: process.env.REACT_APP_FCM_MESSAGING_SENDER_ID,
  appId: process.env.REACT_APP_FCM_APP_ID,
  measurementId: process.env.REACT_APP_FCM_MEASUREMENT_ID,
  databaseURL: process.env.REACT_APP_FIREBASE_DATABASE_URL,
}

firebase.initializeApp(firebaseConfig);

export default firebase;