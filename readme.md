https://github.com/ziquanmiao/minikube_datadog

helm install datadog-agent -f datadog-values.yaml --set datadog.site='eu.datadoghq.com' --set datadog.apiKey='9f5a7cf3a44c6f5d940c2f8a900d4c46' datadog/datadog

ignore k8s bc hassle and also docker seems to be taking all machine memory.

instead, install dd agent on mac

DD_AGENT_MAJOR_VERSION=7 DD_API_KEY=9f5a7cf3a44c6f5d940c2f8a900d4c46 DD_SITE="datadoghq.eu" bash -c "$(curl -L https://s3.amazonaws.com/dd-agent/scripts/install_mac_os.sh)"

