package gun2odev;

public class TranscriptManager {
	
	public int[] getCourseIdsByUserId(Transcript[] transcript,int userId) {
		int[] courseIds = {};
		int i = 0;
		
		for(Transcript course:transcript) {
			if(userId == course.user) {
				courseIds[i] = course.course;
				i++;
			}
		}
		
		return courseIds;
		
	}
	public Transcript[] addUserToCourse(Transcript[] transcript,int user,int course) {
		int lastTranscriptId = transcript.length + 1;
		Transcript transcriptadding = new Transcript(lastTranscriptId,user,course);
		
		transcript[ lastTranscriptId ] = transcriptadding;
		return transcript;
	}

}
