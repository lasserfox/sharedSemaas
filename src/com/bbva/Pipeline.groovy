class Pipeline {
    String NS = "user.e049773"
    String MR_TYPE = "model-type"
    String MR = "model"
    
    String CERT_FILE = "/home/e049773/Downloads/certs/personal/cert.pem"
    String KEY_FILE = "/home/e049773/Downloads/certs/personal/key.pem"
    String LOG_HOST = "https://omega.work-01.nextgen.igrupobbva"
    
    Public String pipelineId = 'pipeline_' + str(random.randint(0, 10))
    Public int startDate = int(time.time() * 1000000000)
    Public String trace = new Trace(traceId=pipelineId, spanKey='main')
    Public ArrayList logs = []
    Public ArrayList steps = []

    def Pipeline(){
    }
    
    def Pipeline (String pipelineId){
            this.pipelineId = pipelineId
    }

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