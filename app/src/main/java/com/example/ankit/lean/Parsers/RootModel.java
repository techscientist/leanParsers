import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String timezone;
	public String description;
	public String email;
	public int id;
	public CreatorModel _creator;
	public String end_time;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String schedule_published_on;
	public String start_time;
	public String state;
	public String type;
	public String privacy;
	public String topic;
	public String background_image;
	public String name;
	public CopyrightModel _copyright;
	public String organizer_description;

	public RootModel(String organizer_name, String location_name, ArrayList<Social_linksModel> social_links, String logo, String timezone, String description, String email, int id, CreatorModel creator, String end_time, VersionModel version, Call_for_papersModel call_for_papers, String code_of_conduct, String schedule_published_on, String start_time, String state, String type, String privacy, String topic, String background_image, String name, CopyrightModel copyright, String organizer_description) {

		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.social_links = social_links;
		this.logo = logo;
		this.timezone = timezone;
		this.description = description;
		this.email = email;
		this.id = id;
		this._creator = creator;
		this.end_time = end_time;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.state = state;
		this.type = type;
		this.privacy = privacy;
		this.topic = topic;
		this.background_image = background_image;
		this.name = name;
		this._copyright = copyright;
		this.organizer_description = organizer_description;

	}

}