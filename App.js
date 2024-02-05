import React from 'react';
import {View, NativeModules, Button} from 'react-native';

const {FingerprintModule} = NativeModules;

const App = () => {
  const onPress = async () => {
    const fingerprint = await FingerprintModule.createFingerprintEvent();
    console.log(fingerprint);
  };

  return (
    <View>
      <Button
        title="Click to invoke your native module!"
        color="#841584"
        onPress={onPress}
      />
    </View>
  );
};

export default App;
