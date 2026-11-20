.class public final synthetic Lar/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

.field public final synthetic b:Ler/w;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Ler/w;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar/p;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

    iput-object p2, p0, Lar/p;->b:Ler/w;

    iput-object p3, p0, Lar/p;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lar/p;->a:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

    iget-object v1, p0, Lar/p;->b:Ler/w;

    iget-object v2, p0, Lar/p;->c:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

    invoke-static {v0, v1, v2}, Lar/q;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Ler/w;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
