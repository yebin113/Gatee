export interface Member {
  nickname: string;
  email: string;
  role: string;
  birth: string;
  birthType: string;
  image: string;
  mood: string | null;
}

export interface Question {
  memberName: string;
  question: string;
  correctAnswer: string;
  answerList: string[];
}

export interface Character {
  question: string;
  answer: string;
}

export interface Schedule {
  title: string | null;
  content: string | null;
  category: string | null;
  color: string | null;
  startDate: string | null;
  endDate: string | null;
  participant: string[] | [];
}