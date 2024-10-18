import PropTypes from 'prop-types'
import React, { Component } from 'react'
import Comment from './Comment'

const serverComments = [
    {
        id: 1,
        message: "안녕하세요 집에 가고 싶어요"
    }, {
        id: 2,
        message: "안녕하세요 저도 집에 가고 싶어요"
    }, {
        id: 3,
        message: "안녕하세요 나도 집에 가고 싶어요"
    },
]


export default class CommentList extends Component {
  constructor (props) {
    super(props)

    this.state={
        commentList: []
    }
  }

  componentDidMount(){
    //const {commentList, data1, data2} = this.state; 비구조 할당
    const {commentList} = this.state
  }

  render() {
    return (
        <div>
            {
                this.state.commentList.map(c=>{
                    return(
                        <Comment key={c.id}
                                 id={c.id}
                                 message={c.message}
                        />
                    )
                })
            }
        </div>
    )
  }
}
