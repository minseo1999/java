import PropTypes from 'prop-types'
import React, { Component } from 'react'

/*
    class Component
    state(필드객체)를 가지고 있고 이를 수정할 수 있다
    라이프사이클에 따른 생명주기 메서드를 사용할수있다
 */
class Comment extends Component {
  constructor(props){
    super(props)

    //js에서는 class에 필드영역이없기 때문에
    //저장하고 싶은 데이터를 state라는 객체에 key-value형태로 저장한다.
    this.state = {

    }
  }

  render() {
    return (
      <div>Component</div>
    )
  }
}

export default Comment;