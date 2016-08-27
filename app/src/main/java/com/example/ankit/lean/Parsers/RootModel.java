import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String location_name;
	public String name;
	public String organizer_name;
	public String description;
	public String organizer_description;
	public int id;
	public String email;
	public String background_image;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String start_time;
	public String code_of_conduct;
	public String type;
	public String schedule_published_on;
	public String privacy;
	public CopyrightModel _copyright;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String topic;
	public VersionModel _version;

	public RootModel(CreatorModel creator, String location_name, String name, String organizer_name, String description, String organizer_description, int id, String email, String background_image, String logo, ArrayList<Social_linksModel> social_links, String timezone, String start_time, String code_of_conduct, String type, String schedule_published_on, String privacy, CopyrightModel copyright, String state, Call_for_papersModel call_for_papers, String end_time, String topic, VersionModel version) {

		this._creator = creator;
		this.location_name = location_name;
		this.name = name;
		this.organizer_name = organizer_name;
		this.description = description;
		this.organizer_description = organizer_description;
		this.id = id;
		this.email = email;
		this.background_image = background_image;
		this.logo = logo;
		this.social_links = social_links;
		this.timezone = timezone;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._copyright = copyright;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.topic = topic;
		this._version = version;

	}

}