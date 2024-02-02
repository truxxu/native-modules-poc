import React from 'react';
import {Text, View, NativeModules, Button} from 'react-native';

const App = () => {
  const {FingerprintModule} = NativeModules;
  const onPress = async () => {
    await FingerprintModule.createFingerprintEvent('fasdas', e =>
      console.log(e),
    );
  };

  return (
    <View>
      <Text>App</Text>
      <Button
        title="Click to invoke your native module!"
        color="#841584"
        onPress={onPress}
      />
    </View>
  );
};

export default App;
