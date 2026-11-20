.class public final synthetic Lpr/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ltr/f;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

.field public final synthetic c:Lpr/e0;


# direct methods
.method public synthetic constructor <init>(Ltr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lpr/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpr/t;->a:Ltr/f;

    iput-object p2, p0, Lpr/t;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iput-object p3, p0, Lpr/t;->c:Lpr/e0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpr/t;->a:Ltr/f;

    iget-object v1, p0, Lpr/t;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v2, p0, Lpr/t;->c:Lpr/e0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lpr/e0;->c(Ltr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lpr/e0;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
