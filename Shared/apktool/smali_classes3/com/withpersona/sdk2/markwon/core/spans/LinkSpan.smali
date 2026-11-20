.class public Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;
.super Landroid/text/style/URLSpan;
.source "SourceFile"


# instance fields
.field public final a:Lts/c;

.field public final b:Ljava/lang/String;

.field public final c:Lss/c;


# direct methods
.method public constructor <init>(Lts/c;Ljava/lang/String;Lss/c;)V
    .locals 0
    .param p1    # Lts/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lss/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p2}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->a:Lts/c;

    iput-object p2, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->c:Lss/c;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->c:Lss/c;

    iget-object v1, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->b:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Lss/c;->a(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1
    .param p1    # Landroid/text/TextPaint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;->a:Lts/c;

    invoke-virtual {v0, p1}, Lts/c;->f(Landroid/text/TextPaint;)V

    return-void
.end method
