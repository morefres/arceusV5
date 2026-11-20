.class public Lti/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsi/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lti/h;->j(Landroid/content/Context;Ljava/lang/String;Lti/h$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lti/h$f;

.field public final synthetic b:Lti/h;


# direct methods
.method public constructor <init>(Lti/h;Lti/h$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lti/h$b;->b:Lti/h;

    iput-object p2, p0, Lti/h$b;->a:Lti/h$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lti/h$b;->a:Lti/h$f;

    invoke-interface {v0}, Lti/h$f;->a()V

    return-void
.end method
