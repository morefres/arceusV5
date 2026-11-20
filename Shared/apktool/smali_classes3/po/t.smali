.class public final synthetic Lpo/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lpo/m0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic c:Ltr/f;


# direct methods
.method public synthetic constructor <init>(Lpo/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Ltr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/t;->a:Lpo/m0;

    iput-object p2, p0, Lpo/t;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p3, p0, Lpo/t;->c:Ltr/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpo/t;->a:Lpo/m0;

    iget-object v1, p0, Lpo/t;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v2, p0, Lpo/t;->c:Ltr/f;

    invoke-static {v0, v1, v2}, Lpo/m0;->j(Lpo/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Ltr/f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
