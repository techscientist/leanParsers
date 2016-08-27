import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public CreatorModel _creator;
	public String timezone;
	public String type;
	public int id;
	public String privacy;
	public String organizer_name;
	public String logo;
	public String state;
	public String end_time;
	public String code_of_conduct;
	public String description;
	public String topic;
	public String schedule_published_on;
	public String background_image;
	public String location_name;
	public String start_time;

	public RootModel(VersionModel version, String name, String organizer_description, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, Call_for_papersModel call_for_papers, String email, CreatorModel creator, String timezone, String type, int id, String privacy, String organizer_name, String logo, String state, String end_time, String code_of_conduct, String description, String topic, String schedule_published_on, String background_image, String location_name, String start_time) {

		this._version = version;
		this.name = name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this._creator = creator;
		this.timezone = timezone;
		this.type = type;
		this.id = id;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.state = state;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.location_name = location_name;
		this.start_time = start_time;

	}

}