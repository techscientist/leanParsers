import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String organizer_description;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String topic;
	public int id;
	public String background_image;
	public String description;
	public String type;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String start_time;
	public String timezone;
	public String state;
	public String name;
	public String email;
	public String schedule_published_on;
	public String privacy;
	public String organizer_name;
	public String location_name;

	public RootModel(ArrayList<Social_linksModel> social_links, String logo, Call_for_papersModel call_for_papers, String end_time, String organizer_description, String code_of_conduct, CreatorModel creator, String topic, int id, String background_image, String description, String type, VersionModel version, CopyrightModel copyright, String start_time, String timezone, String state, String name, String email, String schedule_published_on, String privacy, String organizer_name, String location_name) {

		this.social_links = social_links;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.topic = topic;
		this.id = id;
		this.background_image = background_image;
		this.description = description;
		this.type = type;
		this._version = version;
		this._copyright = copyright;
		this.start_time = start_time;
		this.timezone = timezone;
		this.state = state;
		this.name = name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.location_name = location_name;

	}

}