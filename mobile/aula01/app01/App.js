import React from 'react';
import {View, Text, TextInput, StyleSheet, Button} from 'react-native';

const inputStyle = StyleSheet.create({
    input: {
        backgroundColor: "lightcyan", 
        borderColor: "red", 
        borderWidth: 1,
        borderRadius: 20,
        border}
      });

function Principal() { 
  return (
    <View style={{backgroundColor: "lightyellow",
    flex: 1, justifyContent: "center", alignItems: "center"}}>
      <Text>Nome: </Text>
      <TextInput style={inputStyle}/>
      <Button title="Gravar"/>
    </View>
  );
}
export default Principal;