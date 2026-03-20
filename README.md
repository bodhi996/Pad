# Pad
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<style>
  *{box-sizing:border-box;margin:0;padding:0}
  body{font-family:'Inter','Segoe UI',system-ui,sans-serif;background:#F4F7FD;color:#0D1E35;display:flex;flex-direction:column;align-items:center;justify-content:center;min-height:100vh;padding:32px 16px}
  .logo{display:flex;align-items:center;gap:10px;margin-bottom:32px}
  .logo-text{font-size:22px;font-weight:800;color:#0D1E35;letter-spacing:-0.5px}
  .logo-text span{color:#2F80ED}
  .card{background:#fff;border:1px solid #D5E3F7;border-radius:16px;padding:32px 36px;max-width:560px;width:100%;box-shadow:0 2px 16px #2F80ED08}
  h2{font-size:22px;font-weight:800;color:#0D1E35;margin-bottom:8px}
  .sub{color:#3D5472;font-size:13px;line-height:1.7;margin-bottom:28px}
  .slides-list{display:flex;flex-direction:column;gap:8px;margin-bottom:28px}
  .slide-row{display:flex;align-items:center;gap:10px;padding:10px 14px;background:#F4F7FD;border-radius:8px;border:1px solid #EDF2FB}
  .slide-num{width:22px;height:22px;border-radius:50%;background:#2F80ED;color:#fff;font-size:10px;font-weight:800;display:flex;align-items:center;justify-content:center;flex-shrink:0}
  .slide-label{font-size:12px;font-weight:600;color:#0D1E35}
  .slide-desc{font-size:11px;color:#7B96B8;margin-left:auto}
  .btn{width:100%;padding:14px;background:#2F80ED;color:#fff;border:none;border-radius:10px;font-size:14px;font-weight:800;cursor:pointer;letter-spacing:0.2px;transition:all 0.2s;display:flex;align-items:center;justify-content:center;gap:8px}
  .btn:hover{background:#1a6fd4;transform:translateY(-1px);box-shadow:0 4px 16px #2F80ED30}
  .btn:active{transform:translateY(0)}
  .btn:disabled{background:#B0C4DD;cursor:not-allowed;transform:none;box-shadow:none}
  .progress{margin-top:16px;font-size:12px;color:#7B96B8;text-align:center;min-height:20px}
  .progress.done{color:#12C479;font-weight:700}
  .note{margin-top:14px;font-size:11px;color:#7B96B8;text-align:center;line-height:1.6}
  .badge{display:inline-block;background:#2F80ED15;color:#2F80ED;border:1px solid #2F80ED30;border-radius:4px;padding:2px 8px;font-size:10px;font-weight:700;letter-spacing:1px;text-transform:uppercase;margin-bottom:16px}
</style>
</head>
<body>

<div class="logo">
  <svg width="40" height="26" viewBox="0 0 54 36" fill="none">
    <rect width="54" height="36" rx="7" fill="#2F80ED"/>
    <path d="M9 7h13c4 0 6.5 2.5 6.5 5.5S26 18 22 18h-5.5l7 11h-6L11 18v11H8V7z" fill="white"/>
    <path d="M35 7l9 22h-5l-1.8-4.5H29L27.2 29h-5L31 7h4zm-2 4l-3.2 9.5h6.4L33 11z" fill="white"/>
  </svg>
  <div class="logo-text">razor<span>pay</span></div>
</div>

<div class="card">
  <div class="badge">AI THESIS · MARCH 2026</div>
  <h2>Download Editable PowerPoint</h2>
  <p class="sub">Generates a fully formatted 11-slide .pptx file with Razorpay branding, all content, charts, and tables — ready to open and edit in PowerPoint or Google Slides.</p>

  <div class="slides-list">
    <div class="slide-row"><div class="slide-num">1</div><div class="slide-label">Cover</div><div class="slide-desc">Razorpay branding + thesis overview</div></div>
    <div class="slide-row"><div class="slide-num">2</div><div class="slide-label">The Global AI Landscape</div><div class="slide-desc">Context + macro stats</div></div>
    <div class="slide-row"><div class="slide-num">3</div><div class="slide-label">Benchmarks</div><div class="slide-desc">Supernovas vs. Shooting Stars</div></div>
    <div class="slide-row"><div class="slide-num">4</div><div class="slide-label">AI Infrastructure</div><div class="slide-desc">Second Act + dark matter</div></div>
    <div class="slide-row"><div class="slide-num">5</div><div class="slide-label">Dev Tools + Vertical AI</div><div class="slide-desc">MCP, memory, verticals</div></div>
    <div class="slide-row"><div class="slide-num">6</div><div class="slide-label">5 Predictions 2025–26</div><div class="slide-desc">High-conviction AI calls</div></div>
    <div class="slide-row"><div class="slide-num">7</div><div class="slide-label">S45</div><div class="slide-desc">Agent orchestration platform</div></div>
    <div class="slide-row"><div class="slide-num">8</div><div class="slide-label">mem0</div><div class="slide-desc">Persistent AI memory layer</div></div>
    <div class="slide-row"><div class="slide-num">9</div><div class="slide-label">altorlab</div><div class="slide-desc">Zero-cost vector search</div></div>
    <div class="slide-row"><div class="slide-num">10</div><div class="slide-label">Unified Thesis</div><div class="slide-desc">AI infrastructure flywheel</div></div>
    <div class="slide-row"><div class="slide-num">11</div><div class="slide-label">One-Pager Summary</div><div class="slide-desc">Problem · Moat · Ask per company</div></div>
  </div>

  <button class="btn" id="dlBtn" onclick="generate()">
    <svg width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round"><path d="M21 15v4a2 2 0 01-2 2H5a2 2 0 01-2-2v-4"/><polyline points="7 10 12 15 17 10"/><line x1="12" y1="15" x2="12" y2="3"/></svg>
    Download Razorpay-AI-Thesis-2025.pptx
  </button>
  <div class="progress" id="prog"></div>
  <p class="note">Opens in Microsoft PowerPoint, Keynote, or Google Slides.<br/>All text, colours, and layout are fully editable.</p>
</div>

<script>
let pptxLoaded = false;

async function loadLib() {
  if (pptxLoaded) return true;
  return new Promise((resolve, reject) => {
    const s = document.createElement('script');
    s.src = 'https://cdn.jsdelivr.net/npm/pptxgenjs@3.12.0/dist/pptxgen.bundle.js';
    s.onload = () => { pptxLoaded = true; resolve(true); };
    s.onerror = () => {
      const s2 = document.createElement('script');
      s2.src = 'https://unpkg.com/pptxgenjs@3.12.0/dist/pptxgen.bundle.js';
      s2.onload = () => { pptxLoaded = true; resolve(true); };
      s2.onerror = () => reject(new Error('Could not load PptxGenJS from any CDN'));
      document.head.appendChild(s2);
    };
    document.head.appendChild(s);
  });
}

async function generate() {
  const btn = document.getElementById('dlBtn');
  const prog = document.getElementById('prog');
  btn.disabled = true;
  btn.innerHTML = '<svg width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="10"/><polyline points="12 6 12 12 16 14"/></svg> Loading library...';

  try {
    await loadLib();
  } catch(e) {
    prog.textContent = 'Failed to load library: ' + e.message;
    prog.style.color = '#EF4444';
    btn.disabled = false;
    btn.innerHTML = 'Retry Download';
    return;
  }

  btn.innerHTML = '<svg width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="10"/><polyline points="12 6 12 12 16 14"/></svg> Generating...';

  const steps = ['Setting up slides...','Building cover + context...','Adding benchmarks...','Rendering roadmaps...','Building company pages...','Composing thesis + summary...','Finalising file...'];
  let si = 0;
  const ticker = setInterval(() => { if(si < steps.length) prog.textContent = steps[si++]; }, 400);

  try {
    const PptxGenJS = window.PptxGenJS || window.pptxgen;
    if (!PptxGenJS) throw new Error('PptxGenJS not available after load');
    const pptx = new PptxGenJS();
    pptx.layout = 'LAYOUT_WIDE';
    pptx.title = 'Razorpay AI Investment Thesis 2025';
    pptx.subject = 'AI Strategy & Portfolio';
    pptx.author = 'Razorpay';

    const W=13.33, H=7.5;
    const RP='2F80ED', RP2='1BC5FF', GR='12C479', AM='F59E0B';
    const TX='0D1E35', TX2='3D5472', MU='7B96B8';
    const BG='F4F7FD', WH='FFFFFF', BD='D5E3F7', CD='EDF2FB', RD='EF4444';

    const addBg = s => s.addShape(pptx.ShapeType.rect, {x:0,y:0,w:W,h:H,fill:{color:BG},line:{color:BG}});

    const addHdr = (s, tag, tc) => {
      s.addShape(pptx.ShapeType.rect, {x:0,y:0,w:W,h:0.55,fill:{color:WH},line:{color:BD,width:0.5}});
      s.addText([{text:'razor',options:{color:TX,bold:true}},{text:'pay',options:{color:RP,bold:true}}], {x:0.3,y:0.07,w:2,h:0.42,fontSize:17,fontFace:'Arial'});
      s.addText('CONFIDENTIAL · MARCH 2026', {x:W-2.8,y:0.17,w:2.5,h:0.22,fontSize:7,color:MU,align:'right'});
      if(tag){
        s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:0.65,w:2.5,h:0.22,fill:{color:tc+'22'},line:{color:tc+'55',width:0.5},rectRadius:0.04});
        s.addText(tag.toUpperCase(),{x:0.3,y:0.65,w:2.5,h:0.22,fontSize:7,bold:true,color:tc,align:'center',valign:'middle'});
      }
    };

    const addTitle = (s, title, sub, y=0.96) => {
      s.addText(title, {x:0.3,y,w:12.7,h:0.62,fontSize:22,bold:true,color:TX,fontFace:'Arial'});
      if(sub) s.addText(sub, {x:0.3,y:y+0.62,w:12.7,h:0.42,fontSize:10.5,color:TX2,wrap:true});
    };

    const addCard = (s,x,y,w,h,ac) => {
      s.addShape(pptx.ShapeType.roundRect,{x,y,w,h,fill:{color:WH},line:{color:BD,width:0.5},rectRadius:0.1});
      if(ac) s.addShape(pptx.ShapeType.rect,{x,y,w:0.06,h,fill:{color:ac},line:{color:ac}});
    };

    const addCardTop = (s,x,y,w,h,ac) => {
      s.addShape(pptx.ShapeType.roundRect,{x,y,w,h,fill:{color:WH},line:{color:BD,width:0.5},rectRadius:0.1});
      s.addShape(pptx.ShapeType.rect,{x,y,w,h:0.07,fill:{color:ac},line:{color:ac}});
    };

    const addFooter = (s,n) => {
      s.addShape(pptx.ShapeType.rect,{x:0,y:7.38,w:W,h:0.12,fill:{color:RP},line:{color:RP}});
      if(n) s.addText(''+n+' / 11',{x:W-1.0,y:7.38,w:0.8,h:0.12,fontSize:7,color:WH,align:'right',valign:'middle'});
    };

    // ── S1 COVER ──
    {
      const s = pptx.addSlide();
      s.addShape(pptx.ShapeType.rect,{x:0,y:0,w:W,h:H,fill:{color:'EDF5FF'},line:{color:'EDF5FF'}});
      s.addShape(pptx.ShapeType.ellipse,{x:9.0,y:-1.2,w:5.5,h:5.5,fill:{color:RP,transparency:91},line:{color:RP,transparency:91}});
      s.addShape(pptx.ShapeType.ellipse,{x:-0.8,y:5.2,w:3.8,h:3.8,fill:{color:RP2,transparency:93},line:{color:RP2,transparency:93}});
      s.addShape(pptx.ShapeType.rect,{x:0,y:0,w:W,h:0.55,fill:{color:WH},line:{color:BD,width:0.5}});
      s.addText([{text:'razor',options:{color:TX,bold:true}},{text:'pay',options:{color:RP,bold:true}}],{x:0.3,y:0.07,w:2.2,h:0.42,fontSize:18});
      s.addText('CONFIDENTIAL · MARCH 2026',{x:W-2.8,y:0.17,w:2.5,h:0.22,fontSize:7,color:MU,align:'right'});
      s.addShape(pptx.ShapeType.roundRect,{x:4.0,y:0.75,w:5.3,h:0.27,fill:{color:RP+'16'},line:{color:RP+'30',width:0.5},rectRadius:0.13});
      s.addText('AI STRATEGY · INVESTMENT THESIS · MARCH 2026 · INTERNAL',{x:4.0,y:0.75,w:5.3,h:0.27,fontSize:7,bold:true,color:RP,align:'center',valign:'middle'});
      s.addText("Razorpay's",{x:2.0,y:1.2,w:9.3,h:0.7,fontSize:38,bold:true,color:TX,align:'center'});
      s.addText("AI Investment Thesis",{x:1.5,y:1.9,w:10.3,h:0.85,fontSize:40,bold:true,color:RP,align:'center'});
      s.addText("A unified strategic framework for Razorpay's AI bets — spanning the global AI landscape,\nthe agentic infrastructure stack, and three high-conviction portfolio companies.",{x:2.5,y:2.95,w:8.3,h:0.7,fontSize:11,color:TX2,align:'center'});
      const pills=[['🌐','AI Landscape 2025','Global context + benchmarks',RP],['⚙️','S45','Agent orchestration',RP],['🧠','mem0','Persistent AI memory',GR],['🔍','altorlab','Zero-cost vector search',RP2]];
      pills.forEach(([ic,n,d,c],i)=>{
        const px=1.2+i*2.78;
        s.addShape(pptx.ShapeType.roundRect,{x:px,y:3.9,w:2.55,h:1.1,fill:{color:WH},line:{color:c+'35',width:0.8},rectRadius:0.1});
        s.addShape(pptx.ShapeType.rect,{x:px,y:3.9,w:2.55,h:0.06,fill:{color:c},line:{color:c}});
        s.addText(ic+' '+n,{x:px,y:4.05,w:2.55,h:0.35,fontSize:12,bold:true,color:c,align:'center'});
        s.addText(d,{x:px,y:4.42,w:2.55,h:0.3,fontSize:9,color:MU,align:'center'});
      });
      s.addShape(pptx.ShapeType.rect,{x:0,y:7.38,w:W,h:0.12,fill:{color:RP},line:{color:RP}});
    }

    // ── S2 AI CONTEXT ──
    {
      const s = pptx.addSlide(); addBg(s); addHdr(s,'01 — AI Context',RP);
      addTitle(s,'The Global AI Landscape in 2025',"Understanding the macro AI moment is table stakes for any strategic investment decision. Here is the lens through which Razorpay's AI thesis is built.");
      const pts=[['💥','The AI Big Bang',"ChatGPT's mass release triggered the biggest wave of technology change ever seen. 2025 is First Light — clusters of foundational companies and best practices are forming."],['📈','Revenue is the signal','Updated benchmarks from 20+ standout AI companies define what "great" looks like — far beyond the SaaS era. AI startups generate revenue at unprecedented velocity.'],['☁️','No cloud without AI','AI is no longer a feature — it is the product. Every infrastructure layer is being replatformed. There is no cloud without AI, and no AI product without the right AI infrastructure.'],['⚡','Competitive intensity ATH','Promising AI areas attract 2–3× more rivals. SaaS incumbents are building aggressively. Intercom already launched a $100M+ AI revenue product line in their first year.'],['🌀','Dark matter swirling','MCP, AI browsers, and agentic infrastructure are rapidly evolving. The direction is clear: every workflow will be agent-native. Razorpay must build for this reality.'],['🎯',"Razorpay's position","8M+ merchants, $180B+ TPV, 100M+ consumer touchpoints — India's largest AI-native scale vector. The AI infra bet is about owning the layer that powers all of it."]];
      pts.forEach(([ic,h,b],i)=>{
        const col=i%3, row=Math.floor(i/3);
        const px=0.3+col*4.34, py=2.15+row*2.08;
        addCard(s,px,py,4.05,1.9,i===5?RP:undefined);
        const tx=i===5?px+0.18:px+0.12;
        s.addText(ic+' '+h,{x:tx,y:py+0.14,w:3.7,h:0.3,fontSize:11,bold:true,color:i===5?RP:TX});
        s.addText(b,{x:tx,y:py+0.48,w:3.7,h:1.25,fontSize:9.5,color:TX2,wrap:true});
      });
      s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:6.4,w:12.7,h:0.8,fill:{color:RP+'08'},line:{color:RP+'20',width:0.5},rectRadius:0.08});
      [['$110B','AI-first investment in 2024',RP],['42%','US VC deployed to AI',RP2],['600M','ChatGPT weekly users (Mar 2025)',GR],['8.5×','GenAI investment vs. 2022',AM]].forEach(([v,l,c],i)=>{
        const sx=1.0+i*3.1;
        s.addText(v,{x:sx,y:6.48,w:2.5,h:0.32,fontSize:18,bold:true,color:c,align:'center'});
        s.addText(l,{x:sx,y:6.79,w:2.5,h:0.22,fontSize:8,color:MU,align:'center'});
      });
      addFooter(s,2);
    }

    // ── S3 BENCHMARKS ──
    {
      const s = pptx.addSlide(); addBg(s); addHdr(s,'02 — Benchmarks',RP);
      addTitle(s,'What "Great" Looks Like in 2025','Studying 20+ high-growth, durable AI startups — including Perplexity, Abridge, and Cursor — reveals two distinct archetypes that define the AI startup landscape today.');
      addCardTop(s,0.3,2.08,5.95,4.9,AM);
      s.addText('💥 SUPERNOVAS',{x:0.48,y:2.25,w:5.6,h:0.35,fontSize:14,bold:true,color:AM});
      s.addText('Explosively scaling · unprecedented growth',{x:0.48,y:2.6,w:5.6,h:0.24,fontSize:9,color:MU});
      s.addShape(pptx.ShapeType.roundRect,{x:0.48,y:2.92,w:2.6,h:0.78,fill:{color:AM+'12'},line:{color:AM+'25'},rectRadius:0.07});
      s.addShape(pptx.ShapeType.roundRect,{x:3.28,y:2.92,w:2.6,h:0.78,fill:{color:AM+'12'},line:{color:AM+'25'},rectRadius:0.07});
      s.addText('$40M',{x:0.48,y:2.99,w:2.6,h:0.36,fontSize:22,bold:true,color:AM,align:'center'});
      s.addText('Year-1 ARR',{x:0.48,y:3.34,w:2.6,h:0.25,fontSize:8,color:MU,align:'center'});
      s.addText('$125M',{x:3.28,y:2.99,w:2.6,h:0.36,fontSize:22,bold:true,color:AM,align:'center'});
      s.addText('Year-2 ARR',{x:3.28,y:3.34,w:2.6,h:0.25,fontSize:8,color:MU,align:'center'});
      s.addShape(pptx.ShapeType.rect,{x:0.48,y:3.82,w:5.6,h:0.48,fill:{color:CD},line:{color:CD}});
      s.addText('~25% Gross Margin (often negative)   ·   $1.13M ARR per FTE',{x:0.48,y:3.88,w:5.6,h:0.28,fontSize:9.5,bold:true,color:TX,align:'center'});
      s.addText('Fragile retention, thin or negative margins. Close to foundation model functionality — "thin wrapper" risk. Winner-take-all competition makes early hypergrowth a misleading signal.',{x:0.48,y:4.42,w:5.6,h:1.0,fontSize:9.5,color:TX2,wrap:true});

      addCardTop(s,6.5,2.08,6.5,4.9,RP);
      s.addText('⭐ SHOOTING STARS',{x:6.68,y:2.25,w:6.2,h:0.35,fontSize:14,bold:true,color:RP});
      s.addText('Capital-efficient · strong PMF · loyal customers',{x:6.68,y:2.6,w:6.2,h:0.24,fontSize:9,color:MU});
      [['~$3M','Yr 1'],['~$12M','Yr 2'],['~$40M','Yr 3'],['~$103M','Yr 4']].forEach(([v,l],i)=>{
        const ax=6.68+(i%2)*3.05, ay=2.92+Math.floor(i/2)*0.84;
        s.addShape(pptx.ShapeType.roundRect,{x:ax,y:ay,w:2.8,h:0.72,fill:{color:RP+'10'},line:{color:RP+'25'},rectRadius:0.07});
        s.addText(v,{x:ax,y:ay+0.08,w:2.8,h:0.34,fontSize:16,bold:true,color:RP,align:'center'});
        s.addText(l+' ARR',{x:ax,y:ay+0.42,w:2.8,h:0.24,fontSize:8,color:MU,align:'center'});
      });
      s.addShape(pptx.ShapeType.rect,{x:6.68,y:4.67,w:6.2,h:0.48,fill:{color:CD},line:{color:CD}});
      s.addText('~60% Gross Margin   ·   ~$164K ARR per FTE',{x:6.68,y:4.73,w:6.2,h:0.28,fontSize:9.5,bold:true,color:TX,align:'center'});
      s.addText('Strong retention, expansion, and solid gross margins. Grow faster than SaaS predecessors while staying anchored to disciplined scaling. This is the benchmark for Razorpay\'s portfolio companies to aim for.',{x:6.68,y:5.28,w:6.2,h:0.85,fontSize:9.5,color:TX2,wrap:true});

      s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:7.05,w:12.7,h:0.3,fill:{color:RP+'0A'},line:{color:RP+'25'},rectRadius:0.06});
      s.addText('New benchmark — Q2T3: Quadruple, Quadruple, Triple, Triple, Triple. The five-year trajectory of today\'s AI Shooting Stars, achievable with AI-native product velocity.',{x:0.5,y:7.08,w:12.3,h:0.24,fontSize:9,color:RP,bold:true});
      addFooter(s,3);
    }

    // ── S4 INFRASTRUCTURE ──
    {
      const s = pptx.addSlide(); addBg(s); addHdr(s,'03 — AI Infrastructure','0F6FDE');
      addTitle(s,'AI Infrastructure — The Second Act','Foundation models are established. The next chapter is grounding AI in real-world operational context, continuous learning, and production-grade reliability at enterprise scale.');
      [['🌌','Foundation Models','GALAXY FORMED',GR,'OpenAI, Anthropic, Gemini, Llama, xAI dominate. Now moving beyond models into coding agents, MCP integrations, and vertical deployment at scale.'],['🔧','Open-Source Models','GALAXY FORMED',GR,'DeepSeek, Qwen, Mixtral, Kimi match or exceed proprietary models in efficiency. The open ecosystem continues to punch above its weight.'],['⚙️','Infrastructure Second Act','FORMING NOW',AM,'Shift from solving problems to defining them. New tools for RL environments, eval frameworks, and compound AI systems combining memory, planning, and retrieval.']].forEach(([ic,t,tag,tc,b],i)=>{
        const px=0.3+i*4.34;
        addCard(s,px,2.2,4.05,2.1,RP);
        s.addText(ic+' '+t,{x:px+0.18,y:2.35,w:3.7,h:0.32,fontSize:12,bold:true,color:TX});
        s.addShape(pptx.ShapeType.roundRect,{x:px+0.18,y:2.7,w:1.15,h:0.2,fill:{color:tc+'22'},line:{color:tc+'44'},rectRadius:0.04});
        s.addText(tag,{x:px+0.18,y:2.7,w:1.15,h:0.2,fontSize:6.5,bold:true,color:tc,align:'center',valign:'middle'});
        s.addText(b,{x:px+0.18,y:2.97,w:3.7,h:1.15,fontSize:9.5,color:TX2,wrap:true});
      });
      s.addText('Three new infrastructure tool categories emerging now',{x:0.3,y:4.52,w:12.7,h:0.28,fontSize:11,bold:true,color:TX});
      [['RL Environments','Fleet, Matrices, Mechanize, Kaizen — human-generated labelled data no longer sufficient for production AI'],['Eval & Feedback Frameworks','Continuous, use-case-specific feedback loops built on proprietary data, not generic public benchmarks'],['Compound AI Systems','Knowledge retrieval + memory + planning + inference optimization combined into a single production stack']].forEach(([t,b],i)=>{
        const px=0.3+i*4.34;
        s.addShape(pptx.ShapeType.roundRect,{x:px,y:4.87,w:4.05,h:1.15,fill:{color:BG},line:{color:BD},rectRadius:0.08});
        s.addText(t,{x:px+0.15,y:4.97,w:3.75,h:0.28,fontSize:11,bold:true,color:RP});
        s.addText(b,{x:px+0.15,y:5.3,w:3.75,h:0.6,fontSize:9.5,color:TX2,wrap:true});
      });
      s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:6.18,w:12.7,h:0.65,fill:{color:'FFF8ED'},line:{color:AM+'30'},rectRadius:0.08});
      s.addShape(pptx.ShapeType.rect,{x:0.3,y:6.18,w:0.06,h:0.65,fill:{color:AM},line:{color:AM}});
      s.addText('⚠️  Open Question — The Bitter Lesson:',{x:0.48,y:6.24,w:3.8,h:0.25,fontSize:9,bold:true,color:AM});
      s.addText('The most effective AI advances come from computation + general-purpose learning, not handcrafted heuristics. Which techniques will prove most scalable for real-world utility remains actively contested — and is where the next major infrastructure bets will be made.',{x:4.35,y:6.22,w:8.4,h:0.56,fontSize:9.5,color:TX2,wrap:true});
      addFooter(s,4);
    }

    // ── S5 DEV + VERTICAL ──
    {
      const s = pptx.addSlide(); addBg(s); addHdr(s,'04 — Dev + Vertical AI',RP);
      addTitle(s,'Developer Tooling + Vertical AI','Two of the most consequential AI shifts: how software is built (dev tooling), and what software now automates (vertical AI). Both are forming stable, high-value galaxies.');
      s.addText('DEVELOPER PLATFORMS & TOOLING',{x:0.3,y:2.08,w:6.0,h:0.2,fontSize:8,bold:true,color:MU});
      [['AI Engineering as a discipline','GALAXY FORMED',GR,'Natural language is the new programming interface. Prompts are programs. The best teams build systems that learn, adapt, and ship faster every cycle.'],['Model Context Protocol (MCP)','GALAXY FORMING',RP,'The "USB-C of AI" — introduced in late 2024, adopted by OpenAI, Google, Microsoft. Universal spec for agents to access APIs, tools, and real-time data.'],['Memory & Context Infrastructure','DARK MATTER',AM,'Persistent cross-session memory remains unsolved. mem0, Zep, SuperMemory, LangMem are pioneering this layer. Context and memory may be the new moats.']].forEach(([t,tag,tc,b],i)=>{
        const py=2.34+i*1.47;
        addCard(s,0.3,py,6.0,1.35,RP);
        s.addShape(pptx.ShapeType.roundRect,{x:0.48,y:py+0.14,w:1.2,h:0.2,fill:{color:tc+'22'},line:{color:tc+'44'},rectRadius:0.04});
        s.addText(tag,{x:0.48,y:py+0.14,w:1.2,h:0.2,fontSize:6.5,bold:true,color:tc,align:'center',valign:'middle'});
        s.addText(t,{x:0.48,y:py+0.38,w:5.6,h:0.28,fontSize:11,bold:true,color:TX});
        s.addText(b,{x:0.48,y:py+0.66,w:5.6,h:0.58,fontSize:9.5,color:TX2,wrap:true});
      });
      s.addText('VERTICAL AI — THE NEW SAAS',{x:6.6,y:2.08,w:6.4,h:0.2,fontSize:8,bold:true,color:MU});
      s.addText('Adoption accelerating in industries long considered "technophobic." Traditional SaaS failed to solve multi-modal, language-heavy tasks that Vertical AI finally addresses.',{x:6.6,y:2.32,w:6.4,h:0.48,fontSize:9.5,color:TX2,wrap:true});
      [['🏥','Healthcare','Abridge, SmarterDx','Clinical notes, revenue cycle coding automation'],['⚖️','Legal','EvenUp, Ivo, Legora','Demand packages, contract review, legal research'],['🏠','Real Estate','EliseAI','Property management, prospect comms, lease audits'],['🔧','Home Services','Hatch, Rilla','AI CSR teams, in-person sales coaching at scale']].forEach(([ic,cat,cos,ex],i)=>{
        const py=2.87+i*0.82;
        s.addShape(pptx.ShapeType.roundRect,{x:6.6,y:py,w:6.4,h:0.72,fill:{color:BG},line:{color:BD},rectRadius:0.07});
        s.addText(ic+' '+cat,{x:6.8,y:py+0.1,w:1.5,h:0.26,fontSize:10,bold:true,color:TX});
        s.addText(cos,{x:8.35,y:py+0.1,w:2.8,h:0.26,fontSize:10,color:RP,bold:true});
        s.addText(ex,{x:6.8,y:py+0.38,w:6.0,h:0.26,fontSize:9,color:MU});
      });
      s.addShape(pptx.ShapeType.roundRect,{x:6.6,y:6.18,w:6.4,h:0.65,fill:{color:RP+'08'},line:{color:RP+'22'},rectRadius:0.08});
      s.addShape(pptx.ShapeType.rect,{x:6.6,y:6.18,w:0.06,h:0.65,fill:{color:RP},line:{color:RP}});
      s.addText('Razorpay vertical angle',{x:6.78,y:6.24,w:5.8,h:0.24,fontSize:9,bold:true,color:RP});
      s.addText('Fintech is one of the last major "technophobic" AI sectors. Payments, lending, compliance, and merchant intelligence are language-heavy, multi-modal, and dramatically underserved by traditional SaaS.',{x:6.78,y:6.48,w:5.8,h:0.28,fontSize:9,color:TX2});
      addFooter(s,5);
    }

    // ── S6 PREDICTIONS ──
    {
      const s = pptx.addSlide(); addBg(s); addHdr(s,'05 — Predictions',RP);
      addTitle(s,'5 High-Conviction AI Predictions for 2025–26','Synthesized from deep analysis of market data and AI infrastructure trends — applied through the lens of Razorpay\'s strategic position in Indian fintech.');
      [[RP,'🌐','The browser becomes the dominant agentic interface','Agentic browsers like Comet and Dia embed AI at the OS layer — multi-step automation and real-time decision-making. OpenAI and Google are launching AI-native browsers. The new browser wars begin.'],[RP2,'🎬','2026 = the year of generative video','After images (2024) and voice (2025), video crosses the chasm. Veo 3, Kling, Sora, and Marey are accelerating. Cinematic storytelling, real-time avatars, personalized content — commercially viable at scale.'],[GR,'📊','Private evals become critical infrastructure','Enterprise AI deployment 10× because of trusted, use-case-specific eval frameworks. AI vendors must surface provable, explainable performance before purchase — not after deployment.'],[AM,'📱','A new AI-native social media giant emerges','Voice, long-term memory, and generative video are the fuel. Platforms where AI agents may be the main characters. Character.AI and Replika are early signals of what\'s possible.'],[RD,'🤝','Incumbents strike back — AI M&A heats up','SaaS giants acquiring AI capabilities they cannot build fast enough. Wave of consolidation in fintech, healthcare, logistics, and legal. Best-positioned startups: strong moats + embedded workflows.']].forEach(([c,ic,t,b],i)=>{
        const py=2.1+i*1.0;
        addCard(s,0.3,py,12.7,0.9,c);
        s.addText('0'+(i+1),{x:0.5,y:py+0.12,w:0.42,h:0.3,fontSize:14,bold:true,color:c,transparency:60});
        s.addText(ic+' '+t,{x:1.05,y:py+0.1,w:11.5,h:0.3,fontSize:12,bold:true,color:TX});
        s.addText(b,{x:1.05,y:py+0.44,w:11.5,h:0.36,fontSize:9.5,color:TX2,wrap:true});
      });
      addFooter(s,6);
    }

    // ── S7 S45 ──
    {
      const s = pptx.addSlide(); addBg(s); addHdr(s,'Portfolio Company 01/03',RP);
      s.addShape(pptx.ShapeType.roundRect,{x:W-2.8,y:0.65,w:2.5,h:0.22,fill:{color:GR+'22'},line:{color:GR+'44'},rectRadius:0.04});
      s.addText('SEED STAGE',{x:W-2.8,y:0.65,w:2.5,h:0.22,fontSize:7,bold:true,color:GR,align:'center',valign:'middle'});
      addTitle(s,'S45 — Agentic Developer Platform','S45 is building the orchestration and execution layer for production AI agents — the missing infrastructure between raw LLM APIs and reliable, multi-step agentic workflows.');
      addCard(s,0.3,2.2,4.3,3.4);
      s.addText('COMPANY SNAPSHOT',{x:0.5,y:2.36,w:3.9,h:0.2,fontSize:7.5,bold:true,color:MU});
      [['Founded','2024'],['Stage','Seed'],['HQ','Bengaluru / San Francisco'],['Category','AI Agent Infrastructure'],['Partners','~50 design partners']].forEach(([l,v],i)=>{
        const ry=2.64+i*0.5;
        s.addShape(pptx.ShapeType.rect,{x:0.5,y:ry+0.42,w:3.9,h:0.02,fill:{color:CD},line:{color:CD}});
        s.addText(l,{x:0.5,y:ry,w:1.9,h:0.38,fontSize:10,color:TX2});
        s.addText(v,{x:2.5,y:ry,w:1.9,h:0.38,fontSize:10,color:RP,bold:true,align:'right'});
      });
      addCard(s,4.85,2.2,8.15,3.4);
      s.addText('WHAT S45 BUILDS',{x:5.05,y:2.36,w:7.75,h:0.2,fontSize:7.5,bold:true,color:MU});
      [['⚙️','Stateful agent runtime','Persistent task queues, retry logic, and checkpointing for long-running AI agents. State is never lost mid-execution — critical for financial and compliance workflows.'],['🔀','Multi-agent orchestration','Route tasks across specialized agents with human-in-the-loop interruption, tool use authorization, and parallel execution branches.'],['📊','Agent observability','Trace every LLM call, tool invocation, and decision branch. Replay, debug, and evaluate agent behavior in production without losing context.']].forEach(([ic,t,b],i)=>{
        const py=2.62+i*0.92;
        if(i>0){s.addShape(pptx.ShapeType.rect,{x:5.05,y:py-0.06,w:7.75,h:0.02,fill:{color:CD},line:{color:CD}});}
        s.addText(ic+' '+t,{x:5.05,y:py+0.06,w:7.7,h:0.28,fontSize:11,bold:true,color:TX});
        s.addText(b,{x:5.05,y:py+0.34,w:7.7,h:0.48,fontSize:9.5,color:TX2,wrap:true});
      });
      [['50+','Design partners onboarded',RP],['3ms','Avg. agent step latency (p95)',RP2],['99.9%','Task checkpoint reliability',GR]].forEach(([v,l,c],i)=>{
        const px=0.3+i*4.35;
        s.addShape(pptx.ShapeType.roundRect,{x:px,y:5.75,w:4.05,h:0.75,fill:{color:WH},line:{color:c+'30'},rectRadius:0.08});
        s.addShape(pptx.ShapeType.rect,{x:px,y:5.75,w:4.05,h:0.06,fill:{color:c},line:{color:c}});
        s.addText(v,{x:px+0.15,y:5.87,w:2.0,h:0.3,fontSize:20,bold:true,color:c});
        s.addText(l,{x:px+0.15,y:6.17,w:3.75,h:0.22,fontSize:9,color:MU});
      });
      s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:6.64,w:12.7,h:0.62,fill:{color:RP+'08'},line:{color:RP+'22'},rectRadius:0.08});
      s.addShape(pptx.ShapeType.rect,{x:0.3,y:6.64,w:0.06,h:0.62,fill:{color:RP},line:{color:RP}});
      s.addText('Razorpay strategic angle',{x:0.5,y:6.69,w:4,h:0.22,fontSize:9,bold:true,color:RP});
      s.addText("Dispute resolution agents, KYC workflows, and Capital underwriting all need exactly this runtime. Reduces engineering time from months to days. Direct OEM partnership path into Razorpay developer platform and Razorpay X.",{x:0.5,y:6.9,w:12.3,h:0.28,fontSize:9,color:TX2});
      addFooter(s,7);
    }

    // ── S8 mem0 ──
    {
      const s = pptx.addSlide(); addBg(s); addHdr(s,'Portfolio Company 02/03',GR);
      s.addShape(pptx.ShapeType.roundRect,{x:W-2.8,y:0.65,w:2.5,h:0.22,fill:{color:RP+'22'},line:{color:RP+'44'},rectRadius:0.04});
      s.addText('SERIES A',{x:W-2.8,y:0.65,w:2.5,h:0.22,fontSize:7,bold:true,color:RP,align:'center',valign:'middle'});
      addTitle(s,'mem0 — Persistent Memory Layer for AI','mem0 provides a managed memory infrastructure for AI applications — enabling agents and copilots to remember users, preferences, and context across sessions. The memory primitive AI was missing.');
      addCard(s,0.3,2.2,4.3,3.6);
      s.addText('COMPANY SNAPSHOT',{x:0.5,y:2.36,w:3.9,h:0.2,fontSize:7.5,bold:true,color:MU});
      [['Founded','2023'],['Stage','Series A'],['HQ','San Francisco, CA'],['GitHub','30K+ stars'],['Cloud','mem0.ai (managed)']].forEach(([l,v],i)=>{
        const ry=2.64+i*0.52;
        s.addShape(pptx.ShapeType.rect,{x:0.5,y:ry+0.44,w:3.9,h:0.02,fill:{color:CD},line:{color:CD}});
        s.addText(l,{x:0.5,y:ry,w:1.9,h:0.38,fontSize:10,color:TX2});
        s.addText(v,{x:2.5,y:ry,w:1.9,h:0.38,fontSize:10,color:GR,bold:true,align:'right'});
      });
      s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:5.05,w:4.3,h:1.35,fill:{color:WH},line:{color:BD,width:0.5},rectRadius:0.08});
      s.addText('MEMORY TYPES',{x:0.5,y:5.16,w:3.9,h:0.2,fontSize:7.5,bold:true,color:MU});
      [['Short-term','In-context window, session state'],['Long-term','Vector + graph store, cross-session'],['Semantic','Hybrid RAG + episodic retrieval'],['User-level','Per-user preference + history']].forEach(([t,v],i)=>{
        const ry=5.42+i*0.22;
        s.addText(t,{x:0.5,y:ry,w:1.1,h:0.2,fontSize:8.5,color:GR,bold:true});
        s.addText(v,{x:1.68,y:ry,w:2.7,h:0.2,fontSize:8.5,color:TX2});
      });
      addCard(s,4.85,2.2,8.15,3.6);
      s.addText('WHY mem0 WINS',{x:5.05,y:2.36,w:7.75,h:0.2,fontSize:7.5,bold:true,color:MU});
      [['🧠','Persistent cross-session memory','AI agents remember payment preferences, dispute history, and workflow state — like a human relationship manager, at enterprise scale.'],['🔌','Drop-in API, model-agnostic','Works with OpenAI, Claude, Gemini, open-source models. SDKs in Python, JS, Go. 3-line integration. No model lock-in.'],['🔐','Privacy-first architecture','Per-user memory namespacing, GDPR-compliant deletion, full audit trails. DPDP, RBI, and PCI-DSS compatible architecture.'],['📈','Growing developer moat','30K+ GitHub stars, 5K+ production apps. When your AI understands a user\'s world better than anything else, replacing it feels like starting over.']].forEach(([ic,t,b],i)=>{
        const py=2.6+i*0.82;
        if(i>0){s.addShape(pptx.ShapeType.rect,{x:5.05,y:py-0.05,w:7.75,h:0.02,fill:{color:CD},line:{color:CD}});}
        s.addText(ic+' '+t,{x:5.05,y:py+0.04,w:7.7,h:0.26,fontSize:10.5,bold:true,color:TX});
        s.addText(b,{x:5.05,y:py+0.3,w:7.7,h:0.44,fontSize:9.5,color:TX2,wrap:true});
      });
      [['30K+','GitHub stars',GR],['5K+','Production apps',RP],['<10ms','Memory retrieval (p95)',RP2]].forEach(([v,l,c],i)=>{
        const px=0.3+i*4.35;
        s.addShape(pptx.ShapeType.roundRect,{x:px,y:5.95,w:4.05,h:0.7,fill:{color:WH},line:{color:c+'30'},rectRadius:0.08});
        s.addShape(pptx.ShapeType.rect,{x:px,y:5.95,w:4.05,h:0.06,fill:{color:c},line:{color:c}});
        s.addText(v,{x:px+0.15,y:6.06,w:2.0,h:0.3,fontSize:20,bold:true,color:c});
        s.addText(l,{x:px+0.15,y:6.36,w:3.75,h:0.22,fontSize:9,color:MU});
      });
      s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:6.8,w:12.7,h:0.58,fill:{color:GR+'07'},line:{color:GR+'22'},rectRadius:0.08});
      s.addShape(pptx.ShapeType.rect,{x:0.3,y:6.8,w:0.06,h:0.58,fill:{color:GR},line:{color:GR}});
      s.addText('Razorpay strategic angle',{x:0.5,y:6.86,w:4,h:0.22,fontSize:9,bold:true,color:GR});
      s.addText("Razorpay's merchant AI (Smart Collect, Route, Capital) has no persistent memory today. mem0 enables AI that learns payment patterns, flagging thresholds, and credit behavior over time — turning one-shot AI features into compound, personalized intelligence. Direct integration path into Razorpay X and Capital underwriting.",{x:0.5,y:7.06,w:12.3,h:0.25,fontSize:9,color:TX2});
      addFooter(s,8);
    }

    // ── S9 altorlab ──
    {
      const s = pptx.addSlide(); addBg(s); addHdr(s,'Portfolio Company 03/03',RP2);
      s.addShape(pptx.ShapeType.roundRect,{x:W-2.8,y:0.65,w:2.5,h:0.22,fill:{color:AM+'22'},line:{color:AM+'44'},rectRadius:0.04});
      s.addText('PRE-SEED',{x:W-2.8,y:0.65,w:2.5,h:0.22,fontSize:7,bold:true,color:AM,align:'center',valign:'middle'});
      addTitle(s,'altorlab — Zero-Cost Client-Side Vector Search','altorlab built altor-vec: a 54KB WebAssembly HNSW vector search engine that runs entirely in the browser. Every search query is free forever — no server, no API call, no per-query billing.');
      addCard(s,0.3,2.2,4.3,2.65);
      s.addText('COMPANY SNAPSHOT',{x:0.5,y:2.36,w:3.9,h:0.2,fontSize:7.5,bold:true,color:MU});
      [['Product','altor-vec (npm)'],['Stage','Pre-Seed'],['Tech','Rust → WASM (54KB)'],['Algorithm','HNSW — O(log n)'],['Contact','anshul@altorlab.dev']].forEach(([l,v],i)=>{
        const ry=2.62+i*0.47;
        s.addShape(pptx.ShapeType.rect,{x:0.5,y:ry+0.4,w:3.9,h:0.02,fill:{color:CD},line:{color:CD}});
        s.addText(l,{x:0.5,y:ry,w:1.9,h:0.36,fontSize:9.5,color:TX2});
        s.addText(v,{x:2.5,y:ry,w:1.9,h:0.36,fontSize:9.5,color:RP2,bold:true,align:'right'});
      });
      s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:4.98,w:4.3,h:1.18,fill:{color:WH},line:{color:BD,width:0.5},rectRadius:0.08});
      s.addText('THE ECONOMICS CASE',{x:0.5,y:5.09,w:3.9,h:0.2,fontSize:7.5,bold:true,color:MU});
      [['100K MAU · 5 searches/day','15M searches/mo',TX],['Algolia / Pinecone cost','$7,500 / month',RD],['altor-vec cost','$0 / month',GR],['Annual savings','$90,000+',GR]].forEach(([l,v,c],i)=>{
        const ry=5.34+i*0.2;
        s.addText(l,{x:0.5,y:ry,w:2.6,h:0.18,fontSize:9,color:TX2});
        s.addText(v,{x:3.1,y:ry,w:1.3,h:0.18,fontSize:9,bold:true,color:c,align:'right'});
      });
      addCard(s,4.85,2.2,8.15,3.45);
      s.addText('WHY THIS IS A BREAKTHROUGH',{x:5.05,y:2.36,w:7.75,h:0.2,fontSize:7.5,bold:true,color:MU});
      [['💸','Eliminates per-query billing forever','At $0.50 per 1,000 searches, growth linearly destroys margin. altor-vec makes every search free — index loaded once from CDN, all computation runs client-side.'],['⚡','83× faster than cloud search','0.60ms in the browser vs ~50ms round-trip to Algolia/Pinecone. The HNSW algorithm compiled to just 54KB of WebAssembly.'],['🔒','Privacy-native by architecture','Query never leaves the user\'s device. For payments and fintech — where search queries contain transaction and account data — this is a compliance unlock.']].forEach(([ic,t,b],i)=>{
        const py=2.62+i*1.0;
        if(i>0){s.addShape(pptx.ShapeType.rect,{x:5.05,y:py-0.06,w:7.75,h:0.02,fill:{color:CD},line:{color:CD}});}
        s.addText(ic+' '+t,{x:5.05,y:py+0.06,w:7.7,h:0.28,fontSize:11,bold:true,color:TX});
        s.addText(b,{x:5.05,y:py+0.36,w:7.7,h:0.52,fontSize:9.5,color:TX2,wrap:true});
      });
      s.addShape(pptx.ShapeType.roundRect,{x:4.85,y:5.76,w:8.15,h:1.35,fill:{color:WH},line:{color:BD,width:0.5},rectRadius:0.08});
      s.addText('LATENCY BENCHMARK · 10K VECTORS · 384 DIMS',{x:5.05,y:5.88,w:7.75,h:0.2,fontSize:7.5,bold:true,color:MU});
      [['Cloud (Algolia/Pinecone)','~50ms',100,RD],['Chrome — altor-vec','0.60ms',1.2,RP2],['Node.js — altor-vec','0.50ms',1.0,RP2],['Native Rust','0.26ms',0.5,GR]].forEach(([env,lat,pct,bc],i)=>{
        const by=6.14+i*0.24;
        s.addText(env,{x:5.05,y:by,w:3.0,h:0.2,fontSize:8.5,color:i===0?MU:TX});
        s.addShape(pptx.ShapeType.roundRect,{x:8.1,y:by+0.02,w:4.0,h:0.15,fill:{color:CD},line:{color:CD},rectRadius:0.04});
        s.addShape(pptx.ShapeType.roundRect,{x:8.1,y:by+0.02,w:4.0*(pct/100),h:0.15,fill:{color:bc},line:{color:bc},rectRadius:0.04});
        s.addText(lat,{x:12.15,y:by,w:0.75,h:0.2,fontSize:8.5,bold:true,color:i===0?RD:GR,align:'right'});
      });
      s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:7.18,w:12.7,h:0.18,fill:{color:RP2+'0A'},line:{color:RP2+'22'},rectRadius:0.05});
      s.addText('Razorpay: Dashboard + transaction search → $0. Estimated $1.2M–$2M/yr savings. Query data stays in Razorpay infra — direct PCI-DSS + RBI compliance benefit.',{x:0.5,y:7.19,w:12.3,h:0.16,fontSize:8.5,color:RP2,bold:true});
      addFooter(s,9);
    }

    // ── S10 UNIFIED THESIS ──
    {
      const s = pptx.addSlide(); addBg(s); addHdr(s,'10 — Unified Thesis',RP);
      addTitle(s,"Razorpay's AI Infrastructure Thesis","S45, mem0, and altorlab form a coherent, non-overlapping infrastructure stack for the agentic AI era — orchestration, memory, and retrieval.");
      [['⚙️','S45',RP,'Orchestration','The runtime layer — executes reliable, stateful, multi-step agents between raw LLM APIs and production-grade agentic applications.'],['🧠','mem0',GR,'Memory','The intelligence layer — persistent memory across sessions, transforming one-shot AI features into compound, personalized intelligence.'],['🔍','altorlab',RP2,'Retrieval','The retrieval layer — zero-cost, sub-millisecond vector search running on-device with no server round-trip required.']].forEach(([ic,n,c,tag,desc],i)=>{
        const px=0.3+i*4.34;
        s.addShape(pptx.ShapeType.roundRect,{x:px,y:2.18,w:4.05,h:1.62,fill:{color:RP+'04'},line:{color:c+'28',width:0.8},rectRadius:0.1});
        s.addShape(pptx.ShapeType.rect,{x:px,y:2.18,w:4.05,h:0.07,fill:{color:c},line:{color:c}});
        s.addText(ic+' '+n,{x:px+0.15,y:2.32,w:3.75,h:0.38,fontSize:14,bold:true,color:c});
        s.addShape(pptx.ShapeType.roundRect,{x:px+0.15,y:2.73,w:1.05,h:0.2,fill:{color:c+'22'},line:{color:c+'44'},rectRadius:0.04});
        s.addText(tag,{x:px+0.15,y:2.73,w:1.05,h:0.2,fontSize:7,bold:true,color:c,align:'center',valign:'middle'});
        s.addText(desc,{x:px+0.15,y:2.98,w:3.75,h:0.7,fontSize:9.5,color:TX2,wrap:true});
      });
      s.addText('FOUR PILLARS OF THE THESIS',{x:0.3,y:3.94,w:12.7,h:0.2,fontSize:8,bold:true,color:MU});
      [[RP,'💰','Cost elimination, not reduction','All three attack unit economics at the infrastructure layer — not by negotiating better rates, but by rearchitecting so the cost category ceases to exist entirely.'],[GR,'🔒','Privacy as architecture','Queries on-device (altorlab), namespaced memory with audit trails (mem0), permissioned tool use (S45). Compliance becomes a product feature, not a cost center.'],[RP2,'🏗️','Developer-first primitives','All three are SDK-first, npm-installable, GitHub-native. They win by becoming the default import in every AI engineer\'s stack — no 18-month sales cycles required.'],[AM,'🌏','India-native scale vectors','8M+ merchants, 12B monthly UPI transactions, 100M+ consumer touchpoints — the largest AI-native scale vector in the world. This is the infra layer to serve it.']].forEach(([c,ic,t,b],i)=>{
        const col=i%2, row=Math.floor(i/2);
        const px=0.3+col*6.55, py=4.2+row*1.14;
        addCard(s,px,py,6.2,1.05,c);
        s.addText(ic+' '+t,{x:px+0.2,y:py+0.1,w:5.8,h:0.3,fontSize:11,bold:true,color:TX});
        s.addText(b,{x:px+0.2,y:py+0.44,w:5.8,h:0.52,fontSize:9.5,color:TX2,wrap:true});
      });
      s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:6.6,w:12.7,h:0.65,fill:{color:RP+'07'},line:{color:RP+'22'},rectRadius:0.08});
      s.addText('⚡  The Razorpay flywheel — a platform bet, not just a financial investment',{x:0.5,y:6.65,w:12.3,h:0.28,fontSize:10,bold:true,color:TX});
      s.addText("Strategic investment in all three lets Razorpay shape the AI infrastructure stack that India's next generation of fintech products will be built on. This is Razorpay's AWS moment for AI infrastructure.",{x:0.5,y:6.91,w:12.3,h:0.26,fontSize:9.5,color:RP,bold:true});
      addFooter(s,10);
    }

    // ── S11 ONE-PAGER ──
    {
      const s = pptx.addSlide(); addBg(s); addHdr(s,'11 — Summary',RP);
      addTitle(s,'Investment Conviction Summary','Problem · Solution · Moat · Razorpay angle · Investment ask — one row per company, one page for all three decisions.');
      ['PROBLEM','SOLUTION','MOAT','RAZORPAY ANGLE','INVESTMENT ASK'].forEach((c,i)=>{
        s.addText(c,{x:2.4+i*2.15,y:2.18,w:2.0,h:0.2,fontSize:7.5,bold:true,color:MU});
      });
      s.addShape(pptx.ShapeType.rect,{x:0.3,y:2.36,w:12.7,h:0.02,fill:{color:BD},line:{color:BD}});
      [[RP,'⚙️','S45','Orchestration','Building reliable multi-step agents is brittle — state is lost, tool calls fail silently, debugging is impossible in production.','Stateful agent runtime with checkpointing, retry logic, multi-agent routing, and full trace observability.','Switching cost of embedded agent state. Once workflows run on S45, migrating is a multi-quarter project.','Dispute agents, KYC, Capital underwriting. OEM path into Razorpay developer platform and Razorpay X.','Seed investment + 90-day pilot in 1 Razorpay agent product'],[GR,'🧠','mem0','Memory','Every AI session starts from zero. LLMs have no memory of merchant history, preferences, or prior interactions.','Managed memory OS — store, retrieve, update user memory across sessions. Works with any LLM, 3-line integration.','Data gravity + 30K+ OSS flywheel. Once merchant memory is in mem0, it compounds. Switching feels like starting over.','Turns daily Razorpay merchant touchpoints into compound intelligence. Smart Collect + Capital AI integration.','Series A participation + integration into Smart Collect and Capital AI'],[RP2,'🔍','altorlab','Retrieval','Per-query billing scales linearly. At 100K MAU: $7,500/month for search alone — before any AI features are added.','54KB WASM HNSW engine in the browser. Index from CDN once. All searches free, 83× faster than cloud alternatives.','No server = no billing. Query never leaves the device. 83× faster. Three compounding moats in one architecture.','Dashboard search → $0 cost. ~$1.2–2M/yr savings. Query data stays in Razorpay infra — PCI-DSS + RBI benefit.','Pre-seed investment + 3 Razorpay search surfaces deployed Q2 2026']].forEach(([c,ic,n,tag,prob,sol,moat,rp,ask],i)=>{
        const py=2.48+i*1.55;
        s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:py,w:12.7,h:1.42,fill:{color:WH},line:{color:BD,width:0.5},rectRadius:0.09});
        s.addShape(pptx.ShapeType.rect,{x:0.3,y:py,w:0.07,h:1.42,fill:{color:c},line:{color:c}});
        s.addText(ic+' '+n,{x:0.44,y:py+0.1,w:1.75,h:0.34,fontSize:13,bold:true,color:c});
        s.addShape(pptx.ShapeType.roundRect,{x:0.44,y:py+0.48,w:0.85,h:0.18,fill:{color:c+'22'},line:{color:c+'44'},rectRadius:0.04});
        s.addText(tag,{x:0.44,y:py+0.48,w:0.85,h:0.18,fontSize:6.5,bold:true,color:c,align:'center',valign:'middle'});
        [prob,sol,moat,rp,ask].forEach((txt,j)=>{
          s.addText(txt,{x:2.4+j*2.15,y:py+0.1,w:2.0,h:1.22,fontSize:8.5,color:j===4?c:j===0?TX2:TX,bold:j===4,wrap:true,valign:'top'});
        });
      });
      s.addShape(pptx.ShapeType.roundRect,{x:0.3,y:7.18,w:12.7,h:0.2,fill:{color:RP+'08'},line:{color:RP+'20'},rectRadius:0.05});
      s.addText('Combined impact at Razorpay scale:',{x:0.5,y:7.2,w:2.8,h:0.17,fontSize:8,color:TX2});
      s.addText('$2M+ annual savings',{x:3.4,y:7.2,w:2.0,h:0.17,fontSize:8,bold:true,color:GR});
      s.addText('·',{x:5.38,y:7.2,w:0.2,h:0.17,fontSize:8,color:MU});
      s.addText('83× faster search',{x:5.55,y:7.2,w:1.9,h:0.17,fontSize:8,bold:true,color:RP});
      s.addText('·',{x:7.42,y:7.2,w:0.2,h:0.17,fontSize:8,color:MU});
      s.addText('3 AI infra layers owned',{x:7.6,y:7.2,w:2.1,h:0.17,fontSize:8,bold:true,color:RP2});
      s.addText('·',{x:9.65,y:7.2,w:0.2,h:0.17,fontSize:8,color:MU});
      s.addText("Razorpay's AWS moment for AI infrastructure",{x:9.8,y:7.2,w:2.8,h:0.17,fontSize:8,bold:true,color:RP});
      addFooter(s,11);
    }

    clearInterval(ticker);
    prog.textContent = 'Saving file...';
    await pptx.writeFile({ fileName: 'Razorpay-AI-Thesis-2025.pptx' });
    prog.textContent = '✓ Download complete — Razorpay-AI-Thesis-2025.pptx';
    prog.className = 'progress done';
    btn.innerHTML = '<svg width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round"><polyline points="20 6 9 17 4 12"/></svg> Downloaded Successfully';
    btn.style.background = '#12C479';
    btn.disabled = false;
  } catch(err) {
    clearInterval(ticker);
    prog.textContent = 'Error: ' + err.message;
    prog.style.color = '#EF4444';
    btn.disabled = false;
    btn.innerHTML = 'Retry Download';
  }
}
</script>
</body>
</html>







import { useState } from "react";

const A = "#00C2A8";
const B = "#6C5CE7";
const G = "#F9C846";
const R = "#FF6B35";

const Tag = ({ children, c = A }) => (
  <span style={{ background: c + "22", color: c, border: `1px solid ${c}33`, borderRadius: 4, padding: "2px 10px", fontSize: 10, fontWeight: 700, letterSpacing: 1.2, textTransform: "uppercase" }}>{children}</span>
);
const Pill = ({ children, c = A }) => (
  <span style={{ background: c + "18", color: c, borderRadius: 20, padding: "4px 14px", fontSize: 11, fontWeight: 600 }}>{children}</span>
);
const Card = ({ children, style = {} }) => (
  <div style={{ background: "#0E0E1C", border: "1px solid #ffffff0D", borderRadius: 10, padding: "14px 16px", ...style }}>{children}</div>
);

function SlideWrap({ children, style = {} }) {
  return (
    <div style={{ height: "calc(100vh - 78px)", overflowY: "auto", padding: "22px 28px", boxSizing: "border-box", ...style }}>
      {children}
    </div>
  );
}

function SH({ tag, title, sub, c = A }) {
  return (
    <div style={{ marginBottom: 18, flexShrink: 0 }}>
      {tag && <div style={{ marginBottom: 7 }}><Tag c={c}>{tag}</Tag></div>}
      <div style={{ fontSize: 26, fontWeight: 900, letterSpacing: -0.8, lineHeight: 1.15, color: "#fff", marginBottom: sub ? 6 : 0 }}>{title}</div>
      {sub && <div style={{ color: "#555", fontSize: 12, lineHeight: 1.6, maxWidth: 740 }}>{sub}</div>}
    </div>
  );
}

// ─── SLIDE 1: Cover ───────────────────────────────────────────────
function S1() {
  return (
    <div style={{ height: "calc(100vh - 78px)", display: "flex", flexDirection: "column", alignItems: "center", justifyContent: "center", position: "relative", overflow: "hidden", textAlign: "center" }}>
      {[["#00C2A8", -120, -100, 520], [B, "auto", -80, 380], [G, -60, "auto", 260]].map(([col, t, b, s], i) => (
        <div key={i} style={{ position: "absolute", top: t !== "auto" ? t : undefined, bottom: b !== "auto" ? b : undefined, right: i === 0 ? -80 : undefined, left: i === 2 ? -30 : undefined, width: s, height: s, borderRadius: "50%", background: `radial-gradient(circle, ${col}16, transparent 70%)`, pointerEvents: "none" }} />
      ))}
      <div style={{ zIndex: 1, maxWidth: 720 }}>
        <div style={{ display: "flex", gap: 8, justifyContent: "center", marginBottom: 20 }}>
          <Tag c={A}>BESSEMER VENTURE PARTNERS</Tag>
          <Tag c={B}>2025 REPORT</Tag>
        </div>
        <h1 style={{ fontSize: 52, fontWeight: 900, lineHeight: 1.05, margin: "0 0 16px", letterSpacing: -2 }}>
          The State of AI<br />
          <span style={{ background: `linear-gradient(90deg, ${A}, ${B})`, WebkitBackgroundClip: "text", WebkitTextFillColor: "transparent" }}>2025</span>
        </h1>
        <p style={{ color: "#666", fontSize: 15, lineHeight: 1.7, marginBottom: 32, maxWidth: 520, margin: "0 auto 32px" }}>
          Three years after the AI Big Bang — early galaxies are forming in the Cloud AI universe, with plenty of "dark matter" still swirling.
        </p>
        <div style={{ display: "flex", gap: 12, justifyContent: "center", flexWrap: "wrap" }}>
          {[["$1B+", "Deployed to AI-native startups", A], ["20", "Standout AI startups studied", B], ["5", "Bold predictions for 2025–26", G]].map(([v, l, c]) => (
            <div key={l} style={{ background: c + "10", border: `1px solid ${c}28`, borderRadius: 12, padding: "14px 24px", minWidth: 130 }}>
              <div style={{ fontSize: 28, fontWeight: 900, color: c, lineHeight: 1 }}>{v}</div>
              <div style={{ fontSize: 10, color: "#555", marginTop: 4, lineHeight: 1.5 }}>{l}</div>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
}

// ─── SLIDE 2: Big Picture ───────────────────────────────────────
function S2() {
  const pts = [
    { icon: "💥", h: "The AI Big Bang", b: "ChatGPT's mass release triggered the biggest wave of tech change ever seen. In 2025 we've reached First Light — the fog is lifting." },
    { icon: "📈", h: "Revenue growth is the signal", b: "Simple numbers tell the tale. Updated benchmarks show what great AI startups truly look like — distinct from SaaS era benchmarks." },
    { icon: "☁️", h: "No cloud without AI", b: "Bessemer has deployed $1B+ in AI-native startups since 2023. Every legacy SaaS company is now leveraging AI in product and ops." },
    { icon: "⚡", h: "Competitive intensity at ATH", b: "Promising areas attracting 2–3× rivals. SaaS giants are waking up. Intercom already launched a $100M+ AI product." },
    { icon: "🌀", h: "Unpredictability remains", b: "MCP, AI browsers, and other 'dark matter' areas still unresolved. AI is operational — but the map is still fuzzy." },
    { icon: "🔭", h: "This report covers", b: "Benchmarks · Roadmaps (Infra, Dev Tools, Horizontal, Vertical, Consumer) · Dark matter · 5 Predictions for the year ahead." },
  ];
  return (
    <SlideWrap>
      <SH tag="01 — Overview" title="The State of AI in 2025" sub="If 2023 was the AI Big Bang, 2025 feels like First Light. Clusters of foundational companies, best practices, and startup patterns are forming." />
      <div style={{ display: "grid", gridTemplateColumns: "1fr 1fr 1fr", gap: 10 }}>
        {pts.map((p, i) => (
          <Card key={i}>
            <div style={{ fontSize: 22, marginBottom: 8 }}>{p.icon}</div>
            <div style={{ fontWeight: 800, fontSize: 13, color: "#fff", marginBottom: 5 }}>{p.h}</div>
            <div style={{ color: "#666", fontSize: 12, lineHeight: 1.65 }}>{p.b}</div>
          </Card>
        ))}
      </div>
      <div style={{ marginTop: 14, background: A + "0C", border: `1px solid ${A}25`, borderRadius: 10, padding: "12px 18px", display: "flex", gap: 14, alignItems: "center" }}>
        <span style={{ fontSize: 20 }}>💬</span>
        <div style={{ color: "#888", fontSize: 12, fontStyle: "italic", lineHeight: 1.6 }}>
          "We are extremely confident that AI is driving the biggest wave of technology change we've ever seen." — Bessemer Venture Partners, 2025
        </div>
      </div>
    </SlideWrap>
  );
}

// ─── SLIDE 3: Benchmarks Overview ────────────────────────────────
function S3() {
  return (
    <SlideWrap>
      <SH tag="02 — Benchmarks" title={<>What <span style={{ color: A }}>"Great"</span> Looks Like in 2025</>}
        sub="Studying 20 high-growth, durable AI startups across the portfolio and beyond — including Perplexity, Abridge, and Cursor — reveals two distinct archetypes." />
      <div style={{ display: "grid", gridTemplateColumns: "1fr 1fr", gap: 14, marginBottom: 14 }}>
        <div style={{ background: "#0E0E1C", border: `1px solid ${G}30`, borderLeft: `4px solid ${G}`, borderRadius: 10, padding: "18px 20px" }}>
          <div style={{ display: "flex", gap: 10, alignItems: "center", marginBottom: 10 }}>
            <span style={{ fontSize: 24 }}>💥</span>
            <div><div style={{ fontSize: 17, fontWeight: 900, color: G }}>Supernovas</div><div style={{ fontSize: 10, color: "#555" }}>Explosively scaling · unprecedented growth</div></div>
          </div>
          <div style={{ display: "flex", gap: 10, marginBottom: 10 }}>
            {[["$40M", "Year-1 ARR"], ["$125M", "Year-2 ARR"]].map(([v, l]) => (
              <div key={l} style={{ flex: 1, background: G + "10", borderRadius: 8, padding: "10px 12px", textAlign: "center" }}>
                <div style={{ fontSize: 22, fontWeight: 900, color: G }}>{v}</div>
                <div style={{ fontSize: 10, color: "#555", marginTop: 2 }}>{l}</div>
              </div>
            ))}
          </div>
          <div style={{ display: "flex", gap: 8, marginBottom: 10 }}>
            {[["~25%", "Gross Margin"], ["$1.13M", "ARR / FTE"]].map(([v, l]) => (
              <div key={l} style={{ flex: 1, background: "#ffffff07", borderRadius: 6, padding: "8px 10px" }}>
                <div style={{ fontSize: 16, fontWeight: 800, color: "#ddd" }}>{v}</div>
                <div style={{ fontSize: 10, color: "#444" }}>{l}</div>
              </div>
            ))}
          </div>
          <div style={{ fontSize: 11, color: "#555", lineHeight: 1.6, borderTop: "1px solid #ffffff0A", paddingTop: 10 }}>
            Often have fragile retention, thin or negative margins. Close to foundation model functionality — "thin wrapper" risk. Winner-take-all prizes with intense competition.
          </div>
        </div>
        <div style={{ background: "#0E0E1C", border: `1px solid ${A}30`, borderLeft: `4px solid ${A}`, borderRadius: 10, padding: "18px 20px" }}>
          <div style={{ display: "flex", gap: 10, alignItems: "center", marginBottom: 10 }}>
            <span style={{ fontSize: 24 }}>⭐</span>
            <div><div style={{ fontSize: 17, fontWeight: 900, color: A }}>Shooting Stars</div><div style={{ fontSize: 10, color: "#555" }}>Capital-efficient · strong PMF · loyal customers</div></div>
          </div>
          <div style={{ display: "grid", gridTemplateColumns: "1fr 1fr", gap: 8, marginBottom: 10 }}>
            {[["~$3M", "Year-1"], ["~$12M", "Year-2"], ["~$40M", "Year-3"], ["~$103M", "Year-4"]].map(([v, l]) => (
              <div key={l} style={{ background: A + "10", borderRadius: 8, padding: "8px 10px", textAlign: "center" }}>
                <div style={{ fontSize: 16, fontWeight: 900, color: A }}>{v}</div>
                <div style={{ fontSize: 10, color: "#555" }}>{l} ARR</div>
              </div>
            ))}
          </div>
          <div style={{ display: "flex", gap: 8, marginBottom: 10 }}>
            {[["~60%", "Gross Margin"], ["~$164K", "ARR / FTE"]].map(([v, l]) => (
              <div key={l} style={{ flex: 1, background: "#ffffff07", borderRadius: 6, padding: "8px 10px" }}>
                <div style={{ fontSize: 16, fontWeight: 800, color: "#ddd" }}>{v}</div>
                <div style={{ fontSize: 10, color: "#444" }}>{l}</div>
              </div>
            ))}
          </div>
          <div style={{ fontSize: 11, color: "#555", lineHeight: 1.6, borderTop: "1px solid #ffffff0A", paddingTop: 10 }}>
            Strong retention, expansion, and solid gross margins. Grow faster than SaaS predecessors but stay anchored to traditional scaling. The benchmark for AI founders to aim for.
          </div>
        </div>
      </div>
      <div style={{ background: B + "0C", border: `1px solid ${B}25`, borderRadius: 10, padding: "12px 18px" }}>
        <div style={{ fontWeight: 800, fontSize: 12, color: B, marginBottom: 4 }}>The New Growth Framework: Q2T3</div>
        <div style={{ color: "#666", fontSize: 12, lineHeight: 1.6 }}>
          If T2D3 (triple, triple, double, double, double) defined the SaaS era — then <span style={{ color: A, fontWeight: 700 }}>Q2T3 (quadruple, quadruple, triple, triple, triple)</span> better reflects the five-year trajectory of today's AI Shooting Stars. Dozens of startups have already proven it's possible.
        </div>
      </div>
    </SlideWrap>
  );
}

// ─── SLIDE 4: AI Infrastructure ─────────────────────────────────
function S4() {
  const galaxies = [
    { icon: "🌌", t: "Foundation Models", b: "OpenAI, Anthropic, Gemini, Llama, xAI dominate. Moving beyond models into agents for coding, computer use, and MCP integrations." },
    { icon: "🔧", t: "Open-Source Models", b: "Kimi, DeepSeek, Qwen, Mixtral, Llama punch above their weight — matching or exceeding proprietary models in efficiency." },
    { icon: "⚙️", t: "AI Infra Second Act", b: "Shift from solving problems to defining them. New tools for grounding AI in operational context, real-world experience, continuous learning." },
  ];
  const second = [
    { n: "RL Environments", s: "Fleet, Matrices, Mechanize, Kaizen, Vmax, Veris" },
    { n: "Eval & Feedback", s: "Bigspin.ai, Kiln AI, Judgment Labs" },
    { n: "Compound AI Systems", s: "Knowledge retrieval + memory + planning + inference" },
  ];
  return (
    <SlideWrap>
      <SH tag="03 — Roadmap I" c={B} title={<>AI Infrastructure</>}
        sub="Foundational model dominance is clear. The Second Act shifts focus from scaling to grounding AI in real-world operational context." />
      <div style={{ display: "grid", gridTemplateColumns: "1fr 1fr 1fr", gap: 10, marginBottom: 14 }}>
        {galaxies.map((g, i) => (
          <Card key={i} style={{ borderLeft: `3px solid ${B}` }}>
            <div style={{ fontSize: 20, marginBottom: 7 }}>{g.icon}</div>
            <div style={{ fontWeight: 800, fontSize: 13, color: B, marginBottom: 5 }}>Galaxy forming: {g.t}</div>
            <div style={{ color: "#666", fontSize: 12, lineHeight: 1.65 }}>{g.b}</div>
          </Card>
        ))}
      </div>
      <div style={{ background: B + "0A", border: `1px solid ${B}20`, borderRadius: 10, padding: "14px 18px", marginBottom: 10 }}>
        <div style={{ fontWeight: 800, fontSize: 13, color: B, marginBottom: 10 }}>Infrastructure Second Act — Three new tool categories emerging</div>
        <div style={{ display: "flex", gap: 10 }}>
          {second.map((s, i) => (
            <div key={i} style={{ flex: 1, background: "#ffffff06", borderRadius: 8, padding: "10px 12px" }}>
              <div style={{ fontWeight: 700, fontSize: 12, color: "#ddd", marginBottom: 3 }}>{s.n}</div>
              <div style={{ fontSize: 11, color: "#555" }}>{s.s}</div>
            </div>
          ))}
        </div>
      </div>
      <div style={{ background: "#1a0a00", border: "1px solid #3d2200", borderRadius: 10, padding: "12px 16px", display: "flex", gap: 12, alignItems: "flex-start" }}>
        <span style={{ fontSize: 16, marginTop: 1 }}>🌑</span>
        <div>
          <div style={{ fontWeight: 700, fontSize: 12, color: R, marginBottom: 3 }}>Dark Matter: The Bitter Lesson</div>
          <div style={{ fontSize: 11, color: "#664", lineHeight: 1.6 }}>Rich Sutton's "Bitter Lesson" — the most effective AI advances come from computation + general-purpose learning, not handcrafted features. An open question: which techniques will prove most scalable for real-world utility?</div>
        </div>
      </div>
    </SlideWrap>
  );
}

// ─── SLIDE 5: Developer Tools ────────────────────────────────────
function S5() {
  const items = [
    { t: "AI Engineering", b: "Natural language is the new programming interface. Prompts are now programs. The best engineering teams build systems that learn, adapt, and ship faster every cycle.", star: true },
    { t: "Model Context Protocol (MCP)", b: "Introduced by Anthropic (late 2024). Adopted by OpenAI, Google DeepMind, Microsoft. The 'USB-C of AI' — agents access APIs, tools, real-time data. Persistent memory + multi-tool workflows.", star: true },
    { t: "MCP Ecosystem", b: "FastMCP by Prefect simplifies building MCP servers. Arcade and Keycard handle agentic authorization. Expected to become as foundational as HTTP was to the internet." },
  ];
  const dm = [
    { t: "Short-term memory", s: "128K–1M+ token context windows" },
    { t: "Long-term memory", s: "Vector DBs, MemOS, MCP orchestration" },
    { t: "Semantic memory", s: "Hybrid RAG + episodic modules" },
  ];
  return (
    <SlideWrap>
      <SH tag="04 — Roadmap II" c={A} title="Developer Platforms & Tooling"
        sub="AI has ushered in a completely new way of software development — not just incremental evolution. Today the question isn't if your team uses AI, but how well you orchestrate it." />
      <div style={{ display: "flex", flexDirection: "column", gap: 9, marginBottom: 14 }}>
        {items.map((it, i) => (
          <div key={i} style={{ background: "#0E0E1C", border: `1px solid ${A}${it.star ? "30" : "14"}`, borderLeft: `3px solid ${A}${it.star ? "" : "60"}`, borderRadius: 8, padding: "12px 16px" }}>
            <div style={{ display: "flex", gap: 8, alignItems: "center", marginBottom: 5 }}>
              <span style={{ fontWeight: 800, fontSize: 13, color: it.star ? A : "#ddd" }}>{it.t}</span>
              {it.star && <Tag c={A}>Galaxy forming</Tag>}
            </div>
            <div style={{ color: "#666", fontSize: 12, lineHeight: 1.65 }}>{it.b}</div>
          </div>
        ))}
      </div>
      <div style={{ background: "#1a1a00", border: "1px solid #333300", borderRadius: 10, padding: "14px 16px" }}>
        <div style={{ fontWeight: 700, fontSize: 12, color: R, marginBottom: 8, display: "flex", gap: 8, alignItems: "center" }}>
          <span>🌑</span> Dark Matter: Memory & Context — The New Moats
        </div>
        <div style={{ fontSize: 11, color: "#665", lineHeight: 1.6, marginBottom: 10 }}>
          Persistent cross-session memory remains an open challenge. Startups: <span style={{ color: G }}>mem0, Zep, SuperMemory, LangMem</span>. When your product understands a user's world better than anything else, replacing it feels like starting over.
        </div>
        <div style={{ display: "flex", gap: 8 }}>
          {dm.map((d, i) => (
            <div key={i} style={{ flex: 1, background: "#ffffff06", borderRadius: 6, padding: "8px 10px" }}>
              <div style={{ fontSize: 11, fontWeight: 700, color: "#ddd", marginBottom: 2 }}>{d.t}</div>
              <div style={{ fontSize: 10, color: "#444" }}>{d.s}</div>
            </div>
          ))}
        </div>
      </div>
    </SlideWrap>
  );
}

// ─── SLIDE 6: Horizontal AI ──────────────────────────────────────
function S6() {
  const moats = [
    { t: "AI Trojan Horse features", b: "Tap into data flow with a valuable wedge — start capturing data flowing into a SoR without ripping it out on day one." },
    { t: "90% faster implementation", b: "Codegen tools + AI translating business logic to code. 1-day data migrations making historical vendor lock-in nearly obsolete." },
    { t: "10x ROI vs. legacy", b: "Not incremental improvements. Agentic workflows reduce professional services spend and accelerate time-to-value dramatically." },
    { t: "Systems of Action", b: "AI-native apps don't just store data — they act on it. CRM tools auto-log interactions. ERPs automate financial forecasting." },
  ];
  const wedges = [
    { cat: "CRM", cos: "Day.ai, Attio", note: "Auto-log interactions from email, calls, Slack" },
    { cat: "ERP / FP&A", cos: "Everest, Doss, Rillet", note: "Automate financial forecasting + procurement" },
    { cat: "HR & Recruiting", cos: "Multiple startups", note: "AI copilots for screening, onboarding, performance" },
    { cat: "Enterprise Search", cos: "Glean + horizontal copilots", note: "Replacing SharePoint and Notion search" },
    { cat: "IP Management", cos: "Tradespace", note: "AI wedge expanding into full SoR" },
    { cat: "ITSM", cos: "Serval", note: "AI-first service management platform" },
  ];
  return (
    <SlideWrap>
      <SH tag="05 — Roadmap III" c={G} title="Horizontal & Enterprise AI"
        sub="AI is exposing opportunities to disrupt the largest horizontal systems of record. Moats that held firm for decades are now degrading." />
      <div style={{ display: "grid", gridTemplateColumns: "1fr 1fr", gap: 10, marginBottom: 14 }}>
        {moats.map((m, i) => (
          <Card key={i} style={{ borderLeft: `3px solid ${G}` }}>
            <div style={{ fontWeight: 800, fontSize: 12, color: G, marginBottom: 5 }}>{m.t}</div>
            <div style={{ color: "#666", fontSize: 12, lineHeight: 1.6 }}>{m.b}</div>
          </Card>
        ))}
      </div>
      <div style={{ marginBottom: 10 }}>
        <div style={{ fontSize: 11, fontWeight: 700, color: "#444", marginBottom: 8, letterSpacing: 0.8, textTransform: "uppercase" }}>AI wedge plays gaining traction</div>
        <div style={{ display: "grid", gridTemplateColumns: "1fr 1fr 1fr", gap: 7 }}>
          {wedges.map((w, i) => (
            <div key={i} style={{ background: "#0E0E1C", border: "1px solid #ffffff0A", borderRadius: 8, padding: "10px 12px" }}>
              <div style={{ fontWeight: 800, fontSize: 11, color: G, marginBottom: 2 }}>{w.cat}</div>
              <div style={{ fontSize: 12, color: "#aaa", marginBottom: 4, fontWeight: 600 }}>{w.cos}</div>
              <div style={{ fontSize: 11, color: "#555" }}>{w.note}</div>
            </div>
          ))}
        </div>
      </div>
      <div style={{ background: "#1a1500", border: "1px solid #33280a", borderRadius: 10, padding: "10px 14px", display: "flex", gap: 10 }}>
        <span style={{ fontSize: 14, marginTop: 1 }}>🌑</span>
        <div style={{ fontSize: 11, color: "#665", lineHeight: 1.6 }}>
          <span style={{ color: R, fontWeight: 700 }}>Dark Matter — Enterprise ERP:</span> Most AI-native ERP plays target SMB/mid-market. True enterprise ERP replacement (complex manufacturing, supply chain, inventory) is still many years out. Long tail of SoR (Identity Platforms, CAD systems, CMS) = decade-long disruption journey.
        </div>
      </div>
    </SlideWrap>
  );
}

// ─── SLIDE 7: Vertical AI ────────────────────────────────────────
function S7() {
  const verticals = [
    { icon: "🏥", cat: "Healthcare", cos: "Abridge, SmarterDx, OpenEvidence", ex: "Clinical notes, revenue cycle coding, medical literature review" },
    { icon: "⚖️", cat: "Legal", cos: "EvenUp, Ivo, Legora", ex: "Legal demand packages, contract review, legal research & drafting" },
    { icon: "📚", cat: "Education", cos: "Brisk Teaching, MagicSchool", ex: "Grading, tutoring, content creation for teachers" },
    { icon: "🏠", cat: "Real Estate", cos: "EliseAI", ex: "Property management workflows, prospect comms, lease audits" },
    { icon: "🔧", cat: "Home Services", cos: "Hatch, Rilla", ex: "AI-powered CSR teams, in-person sales conversation coaching" },
  ];
  const playbook = [
    { t: "Compelling wedge", b: "Solve a core pain point that is language-heavy or multi-modal — underserved by previous software. Voice/audio appears as a miraculous wedge repeatedly." },
    { t: "Context is key", b: "Defensibility from domain expertise: integrations, data moats, multimodal interfaces. Move beyond fine-tuning into deep, verticalized utility." },
    { t: "Built for value", b: "ROI clear from day one. No spreadsheet needed to explain it. Tools unlock 10x productivity, reduce costs, or drive topline growth." },
  ];
  return (
    <SlideWrap>
      <SH tag="06 — Roadmap IV" c={R} title="Vertical AI — The New SaaS"
        sub="Adoption accelerating in industries long considered 'technophobic'. The issue was never willingness — traditional SaaS failed to solve multi-modal, language-heavy tasks." />
      <div style={{ display: "flex", gap: 8, marginBottom: 14, flexWrap: "wrap" }}>
        {verticals.map((v, i) => (
          <div key={i} style={{ flex: "1 1 170px", background: "#0E0E1C", border: `1px solid ${R}18`, borderTop: `3px solid ${R}`, borderRadius: 8, padding: "12px 14px" }}>
            <div style={{ fontSize: 20, marginBottom: 6 }}>{v.icon}</div>
            <div style={{ fontWeight: 800, fontSize: 12, color: R, marginBottom: 4 }}>{v.cat}</div>
            <div style={{ fontSize: 11, color: "#888", fontWeight: 600, marginBottom: 5 }}>{v.cos}</div>
            <div style={{ fontSize: 11, color: "#555", lineHeight: 1.5 }}>{v.ex}</div>
          </div>
        ))}
      </div>
      <div style={{ marginBottom: 10 }}>
        <div style={{ fontSize: 11, fontWeight: 700, color: "#444", marginBottom: 8, letterSpacing: 0.8, textTransform: "uppercase" }}>The Vertical AI Playbook — 3 pillars</div>
        <div style={{ display: "flex", gap: 8 }}>
          {playbook.map((p, i) => (
            <Card key={i} style={{ flex: 1, borderLeft: `3px solid ${R}` }}>
              <div style={{ fontWeight: 800, fontSize: 12, color: R, marginBottom: 5 }}>{i + 1}. {p.t}</div>
              <div style={{ color: "#666", fontSize: 11, lineHeight: 1.6 }}>{p.b}</div>
            </Card>
          ))}
        </div>
      </div>
    </SlideWrap>
  );
}

// ─── SLIDE 8: Consumer AI ───────────────────────────────────────
function S8() {
  const galaxy = [
    { icon: "🔍", t: "AI Assistants", b: "ChatGPT (~600M WAU) and Gemini (~400M WAU) as of Mar 2025. Daily habit formation across research, planning, advice, conversation." },
    { icon: "🎙️", t: "Voice Modality", b: "LLM-powered voice handles open-ended questions, reflection, fluid exchanges. Vapi powering consumer voice interactions spanning language + emotion." },
    { icon: "🌐", t: "AI Search", b: "Perplexity as breakout darling. Model-agnostic orchestration + blazing UX. Comet (agentic browser) may define the next-gen agent form factor." },
    { icon: "🎨", t: "AI Creation", b: "Create.xyz, Bolt, Lovable (apps) · Suno, Udio (music) · Moonvalley, Runway, Black Forest Labs (video) — every consumer becomes a creator." },
    { icon: "🧠", t: "Mental Health & Wellness", b: "Rosebud (AI journals), Finch (gamified self-care). Character.AI signaled demand — now mainstream with long-term memory + emotional resilience tools." },
    { icon: "❓", t: "Still Contested", b: "Email/calendar AI faces trust barriers and strong incumbents. Meal planning, fitness apps haven't found clear winners vs. general-purpose LLMs." },
  ];
  return (
    <SlideWrap>
      <SH tag="07 — Roadmap V" c={B} title="Consumer AI"
        sub="Shift from productivity tasks to deeper use cases including therapy, companionship, and self-growth. AI is no longer just a task tool — it's entering meaningful areas of life." />
      <div style={{ display: "grid", gridTemplateColumns: "1fr 1fr 1fr", gap: 10, marginBottom: 14 }}>
        {galaxy.map((g, i) => (
          <Card key={i} style={{ borderLeft: `3px solid ${i < 4 ? B : "#444"}` }}>
            <div style={{ fontSize: 18, marginBottom: 6 }}>{g.icon}</div>
            <div style={{ fontWeight: 800, fontSize: 12, color: i < 4 ? B : "#666", marginBottom: 4 }}>
              {i < 4 ? <Tag c={B} style={{ fontSize: 8 }}>Galaxy forming</Tag> : null} {g.t}
            </div>
            <div style={{ color: "#666", fontSize: 11, lineHeight: 1.6 }}>{g.b}</div>
          </Card>
        ))}
      </div>
      <div style={{ background: "#0a0a1a", border: "1px solid #1a1a33", borderRadius: 10, padding: "12px 16px" }}>
        <div style={{ fontWeight: 700, fontSize: 12, color: R, marginBottom: 6, display: "flex", gap: 8 }}>
          <span>🌑</span> Dark Matter — Unmet consumer needs hiding in plain sight
        </div>
        <div style={{ display: "flex", gap: 12 }}>
          {[["✈️ Travel", "Fragmented + time-consuming booking. Personalized end-to-end travel concierge opportunity — enormous but still unclaimed."], ["🛍️ Shopping", "Agents handling browsing, price comparison, and checkout on consumer's behalf. Will reshape e-commerce when agent infra catches up."]].map(([t, b]) => (
            <div key={t} style={{ flex: 1, background: "#ffffff05", borderRadius: 8, padding: "10px 12px" }}>
              <div style={{ fontWeight: 700, fontSize: 12, color: "#ddd", marginBottom: 4 }}>{t}</div>
              <div style={{ fontSize: 11, color: "#555", lineHeight: 1.55 }}>{b}</div>
            </div>
          ))}
        </div>
      </div>
    </SlideWrap>
  );
}

// ─── SLIDE 9: Predictions ────────────────────────────────────────
function S9() {
  const preds = [
    { n: "01", c: A, icon: "🌐", t: "The browser becomes the dominant agentic interface", b: "Agentic browsers like Comet and Dia embed AI at the OS layer. Multi-step automation, intelligent interaction across tabs, real-time decision-making. OpenAI, Google building AI-native browsers. New browser wars begin." },
    { n: "02", c: B, icon: "🎬", t: "2026 = the year of generative video", b: "After images (2024) and voice (2025), video crosses the chasm in 2026. Veo 3, Kling, Sora, Marey accelerating. Use cases: cinematic storytelling, real-time avatars, personalized social content. IP complexity rising." },
    { n: "03", c: G, icon: "📊", t: "Evals & data lineage become critical infrastructure", b: "Enterprise AI deployment 10× because of private, grounded, trusted evals. Braintrust, LangChain, Bigspin.ai, Judgment Labs pioneering. AI vendors must surface provable performance before purchase, not after." },
    { n: "04", c: R, icon: "📱", t: "A new AI-native social media giant could emerge", b: "Breakthroughs in voice, long-term memory, and image/video are fuel. Platforms like Character.AI and Replika hint at social spaces where AI agents are the main characters. Unknown form factor — could launch from niche." },
    { n: "05", c: "#fd79a8", icon: "🤝", t: "Incumbents strike back — AI M&A heats up", b: "SaaS giants acquiring AI-native capabilities they can't build fast enough. Wave of consolidation in healthcare, logistics, fintech, legal. Best-positioned startups: strong technical moats + customer traction + embedded workflows." },
  ];
  return (
    <SlideWrap>
      <SH tag="08 — Predictions" title={<>5 Bold Predictions for <span style={{ color: A }}>2025–26</span></>}
        sub="Surveying Bessemer partners to surface the highest-conviction calls for the AI landscape in the year ahead." />
      <div style={{ display: "flex", flexDirection: "column", gap: 9 }}>
        {preds.map((p) => (
          <div key={p.n} style={{ background: "#0E0E1C", border: `1px solid ${p.c}20`, borderLeft: `3px solid ${p.c}`, borderRadius: 8, padding: "12px 16px", display: "flex", gap: 14, alignItems: "flex-start" }}>
            <div style={{ fontSize: 24, fontWeight: 900, color: p.c, opacity: 0.4, minWidth: 28, lineHeight: 1 }}>{p.n}</div>
            <div style={{ fontSize: 18, flexShrink: 0, marginTop: 2 }}>{p.icon}</div>
            <div>
              <div style={{ fontWeight: 800, fontSize: 13, color: p.c, marginBottom: 4 }}>{p.t}</div>
              <div style={{ color: "#666", fontSize: 11, lineHeight: 1.65 }}>{p.b}</div>
            </div>
          </div>
        ))}
      </div>
    </SlideWrap>
  );
}

// ─── SLIDE 10: Founder Takeaways ─────────────────────────────────
function S10() {
  const tks = [
    { n: "01", c: A, icon: "💥", t: "Two archetypes are winning", b: "Supernovas: ~$100M ARR in 1.5 yrs (fragile retention, thin margins). Shooting Stars: $3M → $100M over 4 yrs (strong PMF, healthy margins). Aim to be a Shooting Star." },
    { n: "02", c: B, icon: "🧠", t: "Memory & context are the new moats", b: "Persistent memory + semantic understanding create emotional and functional lock-in. Build memory-awareness from day one — not as backend plumbing but as a product." },
    { n: "03", c: G, icon: "⚡", t: "Systems of action replace systems of record", b: "Don't bolt AI onto legacy software — reimagine the entire workflow. AI-native apps act on data, not just store it. Start with an AI Trojan Horse wedge." },
    { n: "04", c: R, icon: "🎯", t: "Start with a narrow wedge, prove 10× value", b: "Solve a high-friction, multi-modal, language-heavy problem. Deliver value from day one with no spreadsheet needed to justify ROI. Then expand." },
    { n: "05", c: "#00b894", icon: "🌐", t: "The browser is your canvas", b: "Agentic AI is shifting to the browser layer — a programmable environment where agents observe and execute. Build for this surface; it's the new OS." },
    { n: "06", c: "#fd79a8", icon: "📊", t: "Private evals are mission-critical", b: "Public benchmarks aren't enough. Enterprises demand trusted, explainable, use-case-specific performance. Build eval infrastructure from day one." },
    { n: "07", c: A, icon: "🏭", t: "Vertical AI is the new SaaS", b: "'Technophobic' industries are adopting AI fast. Win by embedding deeply, proving ROI immediately, and scaling quickly. This is a once-in-a-generation opportunity." },
    { n: "08", c: G, icon: "🤝", t: "Be M&A-ready — incumbents are awake", b: "SaaS giants are buying their way into AI. Build technical and data moats. Know your potential acquirer's roadmap — if you can deliver what they can't build fast enough, you're valuable." },
    { n: "09", c: B, icon: "🧭", t: "Speed in the right direction (vector, not just velocity)", b: "Speed alone isn't enough. You need product intuition, empathy, and clarity of purpose. Don't do more AI — do the right AI at the right altitude with the right outcome." },
    { n: "10", c: R, icon: "✨", t: "Taste and judgment are your differentiators", b: "In a world of agents and automation, human insight is the edge. Founders who intuit what should exist — not just what can — will define the next era." },
  ];
  return (
    <SlideWrap>
      <SH tag="09 — Founder Takeaways" title={<>10 Takeaways for <span style={{ color: A }}>AI Founders</span></>}
        sub="The AI universe is expanding fast. Now is the time to build the gravity that holds your galaxy together." />
      <div style={{ display: "grid", gridTemplateColumns: "1fr 1fr", gap: 8 }}>
        {tks.map((tk) => (
          <div key={tk.n} style={{ background: "#0E0E1C", border: `1px solid ${tk.c}15`, borderLeft: `3px solid ${tk.c}`, borderRadius: 8, padding: "10px 14px", display: "flex", gap: 10, alignItems: "flex-start" }}>
            <div style={{ fontSize: 16, flexShrink: 0, marginTop: 2 }}>{tk.icon}</div>
            <div>
              <div style={{ fontWeight: 800, fontSize: 12, color: tk.c, marginBottom: 3 }}>{tk.n}. {tk.t}</div>
              <div style={{ color: "#555", fontSize: 11, lineHeight: 1.55 }}>{tk.b}</div>
            </div>
          </div>
        ))}
      </div>
    </SlideWrap>
  );
}

// ─── SLIDE 11: Closing ───────────────────────────────────────────
function S11() {
  return (
    <div style={{ height: "calc(100vh - 78px)", display: "flex", flexDirection: "column", alignItems: "center", justifyContent: "center", textAlign: "center", position: "relative", overflow: "hidden", padding: "28px" }}>
      {[[A, -100, -100, 500], [B, "auto", -60, 360], [G, -40, "auto", 240]].map(([col, t, b, s], i) => (
        <div key={i} style={{ position: "absolute", top: t !== "auto" ? t : undefined, bottom: b !== "auto" ? b : undefined, right: i === 0 ? -60 : undefined, left: i === 2 ? -20 : undefined, width: s, height: s, borderRadius: "50%", background: `radial-gradient(circle, ${col}12, transparent 70%)`, pointerEvents: "none" }} />
      ))}
      <div style={{ zIndex: 1, maxWidth: 680 }}>
        <div style={{ marginBottom: 16 }}><Tag c={A}>BESSEMER VENTURE PARTNERS · STATE OF AI 2025</Tag></div>
        <h2 style={{ fontSize: 38, fontWeight: 900, lineHeight: 1.1, margin: "0 0 16px", letterSpacing: -1.5 }}>
          We're no longer at the dawn of AI —<br />
          <span style={{ background: `linear-gradient(90deg, ${A}, ${B})`, WebkitBackgroundClip: "text", WebkitTextFillColor: "transparent" }}>
            we're deep in its unfolding galaxies.
          </span>
        </h2>
        <p style={{ color: "#555", fontSize: 13, lineHeight: 1.75, marginBottom: 30, maxWidth: 540, margin: "0 auto 30px" }}>
          Today's top startups aren't just building faster software — they're designing systems that see, listen, reason, and act. Embedding intelligence into the fabric of work and life.
        </p>
        <div style={{ display: "flex", gap: 10, justifyContent: "center", flexWrap: "wrap", marginBottom: 24 }}>
          {[["Build the wedge", A], ["Master memory", B], ["Ship evals early", G], ["Think systems of action", R]].map(([l, c]) => (
            <Pill key={l} c={c}>{l}</Pill>
          ))}
        </div>
        <div style={{ background: "#0E0E1C", border: "1px solid #ffffff0A", borderRadius: 12, padding: "16px 24px", maxWidth: 500, margin: "0 auto" }}>
          <div style={{ fontSize: 13, color: "#888", fontStyle: "italic", lineHeight: 1.7 }}>
            "Success in AI isn't just about velocity. It's about vector — speed in the right direction. The most iconic companies won't be those who simply ride the wave, but those who shape it."
          </div>
          <div style={{ fontSize: 11, color: "#444", marginTop: 8, fontWeight: 700 }}>— Bessemer Venture Partners, State of AI 2025</div>
        </div>
      </div>
    </div>
  );
}

const SLIDES = [
  { id: "cover", label: "Cover", C: S1 },
  { id: "overview", label: "Overview", C: S2 },
  { id: "benchmarks", label: "Benchmarks", C: S3 },
  { id: "infra", label: "AI Infrastructure", C: S4 },
  { id: "devtools", label: "Dev Tools", C: S5 },
  { id: "horizontal", label: "Horizontal AI", C: S6 },
  { id: "vertical", label: "Vertical AI", C: S7 },
  { id: "consumer", label: "Consumer AI", C: S8 },
  { id: "predictions", label: "Predictions", C: S9 },
  { id: "takeaways", label: "Takeaways", C: S10 },
  { id: "closing", label: "Closing", C: S11 },
];

export default function App() {
  const [cur, setCur] = useState(0);
  const { C } = SLIDES[cur];
  return (
    <div style={{ height: "100vh", display: "flex", flexDirection: "column", background: "#070710", color: "#fff", fontFamily: "'Inter','Segoe UI',sans-serif", overflow: "hidden" }}>
      {/* Header */}
      <div style={{ background: "#0B0B18", borderBottom: "1px solid #ffffff0C", padding: "9px 16px", display: "flex", justifyContent: "space-between", alignItems: "center", flexShrink: 0 }}>
        <div style={{ display: "flex", alignItems: "center", gap: 10 }}>
          <div style={{ width: 7, height: 7, borderRadius: "50%", background: A }} />
          <span style={{ fontSize: 11, fontWeight: 800, color: "#ddd", letterSpacing: -0.2 }}>Bessemer Venture Partners</span>
          <span style={{ color: "#333", fontSize: 10 }}>· State of AI 2025</span>
        </div>
        <div style={{ display: "flex", gap: 4, flexWrap: "wrap", justifyContent: "flex-end", maxWidth: 680 }}>
          {SLIDES.map((s, i) => (
            <button key={s.id} onClick={() => setCur(i)} style={{ background: cur === i ? A + "22" : "transparent", color: cur === i ? A : "#444", border: `1px solid ${cur === i ? A + "44" : "transparent"}`, borderRadius: 4, padding: "3px 9px", cursor: "pointer", fontSize: 10, fontWeight: cur === i ? 700 : 400, transition: "all 0.15s" }}>
              {s.label}
            </button>
          ))}
        </div>
      </div>

      {/* Slide */}
      <div style={{ flex: 1, overflow: "hidden" }}><C /></div>

      {/* Footer */}
      <div style={{ background: "#0B0B18", borderTop: "1px solid #ffffff08", padding: "8px 20px", display: "flex", justifyContent: "space-between", alignItems: "center", flexShrink: 0 }}>
        <button onClick={() => setCur(c => Math.max(0, c - 1))} disabled={cur === 0}
          style={{ background: cur === 0 ? "transparent" : "#ffffff0C", color: cur === 0 ? "#222" : "#ccc", border: "none", borderRadius: 6, padding: "5px 16px", cursor: cur === 0 ? "default" : "pointer", fontSize: 11 }}>← Prev</button>
        <div style={{ display: "flex", gap: 5, alignItems: "center" }}>
          {SLIDES.map((_, i) => (
            <div key={i} onClick={() => setCur(i)} style={{ width: cur === i ? 20 : 6, height: 6, borderRadius: 3, background: cur === i ? A : "#222", cursor: "pointer", transition: "all 0.2s" }} />
          ))}
        </div>
        <button onClick={() => setCur(c => Math.min(SLIDES.length - 1, c + 1))} disabled={cur === SLIDES.length - 1}
          style={{ background: cur === SLIDES.length - 1 ? "transparent" : A, color: cur === SLIDES.length - 1 ? "#222" : "#000", border: "none", borderRadius: 6, padding: "5px 16px", cursor: cur === SLIDES.length - 1 ? "default" : "pointer", fontSize: 11, fontWeight: 700 }}>Next →</button>
      </div>
    </div>
  );
}
<img src="Screenshot%20(665).png" width="500" height="400">
