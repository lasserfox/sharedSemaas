public class Pipeline {
    public String NS = "user.e049773"
    public String MR_TYPE = "model-type"
    public String MR = "model"
    
    String CERT_FILE = "/home/e049773/Downloads/certs/personal/cert.pem"
    String KEY_FILE = "/home/e049773/Downloads/certs/personal/key.pem"
    
    def String pipelineId = 'pipeline_' + (Math.abs(new  Random().nextInt() % 10))
    // Public int startDate = int(time.time() * 1000000000)
    // Public String trace = new Trace(traceId=pipelineId, spanKey='main')
    // Public ArrayList logs = []
    // Public ArrayList steps = []
    
    public Pipeline(){
        print ("pipelineId2: " +pipelineId)
        pipelineId = 'test_pipeline_method'
        print ("pipelineId2: " +pipelineId)
    }
    
    // def Pipeline (String pipelineId){
    //         this.pipelineId = pipelineId
    // }

}
    
    


    

    //     for i in range(random.randint(3, 5)):
    //         st = step.Step(self.pipelineId)
    //         st.stepId = 'step_' + str(i)
    //         st.trace.traceId = self.trace.traceId
    //         st.trace.parentSpan = self.trace.spanId
    //         st.trace.spanKey = st.stepId
    //         self.steps.append(st)

    //     for i in range(random.randint(3, 10)):
    //         time.sleep(random.randint(1, 100)/1000)
    //         tmp = log.Log()
    //         self.trace.endTime = tmp.logTime
    //         tmp.traceId = self.trace.traceId
    //         tmp.spanId = self.trace.spanId
    //         tmp.parentSpan = self.trace.spanId
    //         self.logs.append(tmp)

    // def __del__(self):
    //     self.trace.endTime = int(time.time() * 1000000000)